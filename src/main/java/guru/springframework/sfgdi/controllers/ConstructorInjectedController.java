package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
<<<<<<< Updated upstream

=======
import org.springframework.stereotype.Controller;

@Controller
>>>>>>> Stashed changes
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
