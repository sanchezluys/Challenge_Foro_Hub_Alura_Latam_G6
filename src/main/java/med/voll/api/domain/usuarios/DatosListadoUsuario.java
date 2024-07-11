package med.voll.api.domain.usuarios;

import med.voll.api.domain.medico.Medico;

public record DatosListadoUsuario(
        Long id,
        String login,
        String clave
)
{
    public DatosListadoUsuario(Usuario usuario) {
        this(usuario.getId(),
        usuario.getLogin(),
        usuario.getClave());
    }
}
