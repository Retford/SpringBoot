package holaMundo.web;

import holaMundo.dao.IndividuoDao;
import holaMundo.domain.Individuo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j

public class Controlador {
    @Autowired
    private IndividuoDao individuoDao;


    @GetMapping("/")
    public String comienzo(Model model) {
        Iterable<Individuo> individuos = individuoDao.findAll();


        log.info("Estoy ejecutando el controlador MVC");

        model.addAttribute("individuos", individuos);

        return "indice";
    }
}
