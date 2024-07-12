package med.voll.api.domain.topicos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.direccion.DatosDireccion;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje)
{
}
