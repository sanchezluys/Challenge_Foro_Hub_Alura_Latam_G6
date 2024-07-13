package med.voll.api.domain.topicos;

import med.voll.api.domain.direccion.DatosDireccion;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String nombre_curso,
        LocalDateTime fecha_creacion,
        Long autor,
        Boolean activo
)
{

}
