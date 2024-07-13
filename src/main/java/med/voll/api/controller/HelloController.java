package med.voll.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @Operation(summary = "Para verificar que el servidor este activo")
    public String helloWorld() {
        return "Servidor Funcionando OK!";
    }

}
