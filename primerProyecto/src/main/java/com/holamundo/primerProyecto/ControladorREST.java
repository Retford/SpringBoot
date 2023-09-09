package com.holamundo.primerProyecto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorREST {
    @GetMapping("/")
    public String comienzo() {
        log.info("Estoy ejecutando el controlador MVC");

        return "indice";
    }
}
