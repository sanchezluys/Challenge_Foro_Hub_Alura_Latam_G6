package med.voll.api.domain.usuarios;

public record DatosListadoUsuario(
        Long id,
        String login,
        String clave
)
{
    public DatosListadoUsuario(Usuario usuario) {
        this(
                usuario.getId(),
                usuario.getLogin(),
                usuario.getClave());
    }
}
