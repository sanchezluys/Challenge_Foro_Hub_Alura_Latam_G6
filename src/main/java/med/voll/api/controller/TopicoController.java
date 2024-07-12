package med.voll.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import med.voll.api.domain.topicos.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
@SecurityRequirement(name = "bearer-key")
public class TopicoController
{
    @Autowired
    private TopicoRepository topicoRepository;


    @GetMapping
    @Operation(summary = "Obtiene el listado de Topicos")
    public String listadoTopicos(@PageableDefault(size = 10) Pageable paginacion)
    {
//        return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);
        //return ResponseEntity.ok(topicoRepository.findAll(paginacion).map(DatosListadoTopico::new));
//        return ResponseEntity.ok(topicoRepository.findAll(paginacion).map(DatosListadoTopico));
        //return ResponseEntity.ok(topicoRepository.findAll(paginacion).map(topico -> new DatosListadoTopico(topico)));

//        return ResponseEntity.ok(topicoRepository.findAll(paginacion).map(topico -> {
//            // Assuming Topico has attributes id, nombre, descripcion, and fechaCreacion
//            return new DatosListadoTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion());
//        }));
        return "hola";
    }
}
