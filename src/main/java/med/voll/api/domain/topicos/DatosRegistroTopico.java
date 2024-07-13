package med.voll.api.domain.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


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
