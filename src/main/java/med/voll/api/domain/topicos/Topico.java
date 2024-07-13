package med.voll.api.domain.topicos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.usuarios.Usuario;
import med.voll.api.domain.usuarios.UsuarioRepository;

import java.time.LocalDateTime;
import java.util.Optional;

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


    public Topico(DatosRegistroTopico datos, UsuarioRepository usuarioRepository) {

        Usuario autor = new Usuario();

        System.out.println("--------------  LOG  ------------------");
        System.out.println(" Revisando..... autor = "+autor);
        System.out.println("--------------  LOG  ------------------");


        System.out.println("lo que encontre en bd: "+ usuarioRepository.findById(datos.autor()).stream().findFirst());


        this.activo = true;
        this.autor = null; // usuarioRepository.findById(datos.autor()); //buscarAutor(datos.autor());
        this.mensaje = datos.mensaje();
        this.fechaCreacion = LocalDateTime.now();
        this.nombreCurso = datos.nombre_curso();
        this.titulo = datos.titulo();
    }

    private Usuario buscarAutor(Long autor)
    {
        System.out.println("--------------  LOG  ------------------");
        System.out.println(" Revisando..... autor = "+autor);
        System.out.println("--------------  LOG  ------------------");
        // TODO: Implementar la búsqueda del autor en la base de datos
        // Por ejemplo, usando Spring Data JPA:
        //return usuarioRepository.findById(autor).orElse(null);
        return null; // Simulando la búsqueda de un usuario en un repositorio ficticio
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