package holaMundo.primerEjemplo;

import holaMundo.domain.Individuo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
@Profile("estoNo")
public class ControladorUno {
    @Value("${indice.hola2}")
    private String hola2;
    @GetMapping("/")
    public String comienzo(Model model) {
        String hola = "Hola Mundo Rega xd";
        Individuo individuo = new Individuo();
        individuo.setNombre("Daniel");
        individuo.setApellido("Jimenez");
        individuo.setCorreo("daniel@gmail.com");
        individuo.setTelefono("984521451");
        individuo.setEdad("35 años");

        Individuo individuo2 = new Individuo();
        individuo2.setNombre("Juana");
        individuo2.setApellido("Perez");
        individuo2.setCorreo("juegaperez@gmail.com");
        individuo2.setTelefono("9846541521");
        individuo2.setEdad("20 años");

        Individuo individuo3 = new Individuo();
        individuo3.setNombre("Pepe");
        individuo3.setApellido("Paris");
        individuo3.setCorreo("pepeparis@gmail.com");
        individuo3.setTelefono("954215415");
        individuo3.setEdad("25 años");

        //List<Individuo> individuos = new ArrayList<>();
        //individuos.add(individuo);
        //individuos.add(individuo);

        List individuos = Arrays.asList(individuo, individuo2, individuo3);


        log.info("Estoy ejecutando el controlador MVC");

        model.addAttribute("hola", hola);
        model.addAttribute("hola2", hola2);
        model.addAttribute("individuo", individuo);
        model.addAttribute("individuos", individuos);

    return "indice";
    }
}
