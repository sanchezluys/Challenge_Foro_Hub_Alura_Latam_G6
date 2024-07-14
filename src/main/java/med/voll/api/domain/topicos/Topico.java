package med.voll.api.domain.topicos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.usuarios.Usuario;
import med.voll.api.domain.usuarios.UsuarioRepository;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String nombreCurso;
    private LocalDateTime fechaCreacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "autor_id")
    private Usuario autor;
    private Boolean activo;


    public Topico(DatosRegistroTopico datos, UsuarioRepository usuarioRepository)
    {
        this.activo = true;
        this.autor = usuarioRepository.findById(datos.autor()).orElse(null);
        this.mensaje = datos.mensaje();
        this.fechaCreacion = LocalDateTime.now();
        this.nombreCurso = datos.nombre_curso();
        this.titulo = datos.titulo();
    }


    public void actualizarInformacion(DatosActualizarTopico datos)
    {
        if (datos.id()!= null) {
            this.titulo = datos.titulo();
            this.mensaje = datos.mensaje();
        }
    }


    public void eliminar() {
        this.activo = false;
    }
}