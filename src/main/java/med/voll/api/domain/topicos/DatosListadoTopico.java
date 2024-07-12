package med.voll.api.domain.topicos;

import java.time.LocalDateTime;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion
)
{
    public DatosListadoTopico(
            Long id,
            String titulo,
            String mensaje,
            LocalDateTime fechaCreacion)
    {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaCreacion = fechaCreacion;
    }
}
