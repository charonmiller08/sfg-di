package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
<<<<<<< Updated upstream

public class PropertyInjectedController {

    GreetingService greetingService;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;
>>>>>>> Stashed changes

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
