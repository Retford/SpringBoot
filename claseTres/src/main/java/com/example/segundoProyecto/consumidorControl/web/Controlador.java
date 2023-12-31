package com.example.segundoProyecto.consumidorControl.web;



import com.example.segundoProyecto.consumidorControl.domain.Individuo;
import com.example.segundoProyecto.consumidorControl.services.IndividuoServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j

public class Controlador {
    @Autowired
    private IndividuoServices individuoServices;


    @GetMapping("/")
    public String comienzo(Model model) {
        List<Individuo> individuos = (List<Individuo>) individuoServices.listaIndividuos();


        log.info("Estoy ejecutando el controlador MVC");

        model.addAttribute("individuos", individuos);

        return "indice";
    }
}
