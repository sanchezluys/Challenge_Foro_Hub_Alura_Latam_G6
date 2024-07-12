package med.voll.api.domain.topicos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @JoinColumn(name= "autor_id")
    @NotNull
    private Usuario autor;
    private Boolean activo;

    public Topico(DatosRegistroTopico datos)
    {
        System.out.println("--------------  LOG  ------------------");
        System.out.println(" estoy aqui..... datos = "+datos);
        System.out.println("--------------  LOG  ------------------");
        this.activo = true;
        //this.autor = datos.autor();
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