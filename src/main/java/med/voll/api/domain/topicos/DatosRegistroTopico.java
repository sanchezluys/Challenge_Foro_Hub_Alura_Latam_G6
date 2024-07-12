package med.voll.api.domain.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.usuarios.Usuario;


public record DatosRegistroTopico(
        @NotNull
        Long autor,
        @NotBlank
        String mensaje,

        @NotBlank
        String nombre_curso,

        @NotBlank
        String titulo
)
{

}
