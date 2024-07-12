package med.voll.api.domain.topicos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.usuarios.Usuario;

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
    @JoinColumn(name= "author_id")
    private Usuario autor;
    private Boolean activo;

//    public Topico(Long id,
//                  String titulo,
//                  String mensaje,
//                  String nombreCurso,
//                  LocalDateTime fechaCreacion,
//                  Usuario usuario)
//    {
//        this.id = id;
//        this.titulo = titulo;
//        this.mensaje = mensaje;
//        this.nombreCurso = nombreCurso;
//        this.fechaCreacion = fechaCreacion;
//        this.autor = usuario;
//    }
}
