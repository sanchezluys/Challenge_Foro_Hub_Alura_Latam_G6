package med.voll.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.direccion.DatosDireccion;
import med.voll.api.domain.medico.*;
import med.voll.api.domain.usuarios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/usuarios")
@SecurityRequirement(name = "bearer-key")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    @Transactional
    @Operation(summary = "Registra un nuevo Usuario en la base de datos")
    public ResponseEntity<DatosRespuestaUsuario> registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario,
                                                                 UriComponentsBuilder uriComponentsBuilder)
    {
        //DatosRegistroUsuario usuario = DatosRegistroUsuario.createWithHashedClave("luys", "123456");
        Usuario usuario = usuarioRepository.save(new Usuario(datosRegistroUsuario));

        DatosRespuestaUsuario datosRespuestaUsuario = new DatosRespuestaUsuario(
                usuario.getId(),
                usuario.getLogin(),
                usuario.getClave()
                );

        URI url = uriComponentsBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaUsuario);

    }

    @GetMapping
    @Operation(summary = "Obtiene el listado de usuarios")
    public ResponseEntity<Page<DatosListadoUsuario>> listadoUsuarios(@PageableDefault(size = 10) Pageable paginacion)
    {
        //return (ResponseEntity<Page<DatosListadoUsuario>>) usuarioRepository.findAll(paginacion).map(DatosListadoUsuario::new);
        return ResponseEntity.ok(usuarioRepository.findAll(paginacion).map(DatosListadoUsuario::new));
    }

    @PutMapping
    @Transactional
    @Operation(summary = "Actualiza el login o nombre de un usuario existente")
    public ResponseEntity actualizarUsuario(@RequestBody @Valid DatosActualizarUsuario datosActualizarUsuario) {

        Usuario usuario = usuarioRepository.getReferenceById(datosActualizarUsuario.id());

        usuario.actualizarDatos(datosActualizarUsuario);

        return ResponseEntity.ok(
                new DatosRespuestaUsuario(
                        usuario.getId(),
                        usuario.getLogin(),
                        usuario.getClave()
                        ));
    }

    // DELETE LOGICO
    @DeleteMapping("/{id}")
    @Transactional
    @Operation(summary = "Elimina un Usuario registrado - inactivo Soft Deleted")
    public ResponseEntity eliminarUsuario(@PathVariable Long id) {
        Usuario usuario = usuarioRepository.getReferenceById(id);
        usuario.desactivarUsuario();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtiene los datos del usuario con ID")
    public ResponseEntity<DatosRespuestaUsuario> retornaDatosUsuario(@PathVariable Long id) {
        Usuario usuario = usuarioRepository.getReferenceById(id);
        var datosUsuario = new DatosRespuestaUsuario(
                usuario.getId(),
                usuario.getLogin(),
                usuario.getClave()
                );
        return ResponseEntity.ok(datosUsuario);
    }

}