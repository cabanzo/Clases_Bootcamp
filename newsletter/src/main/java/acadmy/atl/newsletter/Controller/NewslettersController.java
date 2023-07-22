package acadmy.atl.newsletter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewslettersController {
    @PostMapping("/api/newsletter")
    public String registrar() {
        return "Hola, funcioné bien, Me entiede Mendez?";
    }
}
