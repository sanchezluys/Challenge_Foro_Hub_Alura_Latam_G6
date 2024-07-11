package med.voll.api.domain.usuarios;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarUsuario(
        @NotNull Long id,
        String login
)
{

}
