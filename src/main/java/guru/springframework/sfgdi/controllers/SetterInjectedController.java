package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
<<<<<<< Updated upstream

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
>>>>>>> Stashed changes
public class SetterInjectedController {

    private GreetingService greetingService;

<<<<<<< Updated upstream
=======
    @Autowired
>>>>>>> Stashed changes
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
