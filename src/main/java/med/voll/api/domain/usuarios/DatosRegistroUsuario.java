package med.voll.api.domain.usuarios;
import jakarta.validation.constraints.*;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public record DatosRegistroUsuario(
        @NotBlank
        String login,
        @NotBlank
        String clave
)
{
    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public DatosRegistroUsuario DatosRegistroUsuario(String login, String clave) {
        String hashedClave = passwordEncoder.encode(clave);
        System.out.println("clave "+ hashedClave);
        return new DatosRegistroUsuario(login, hashedClave);
    }
}
