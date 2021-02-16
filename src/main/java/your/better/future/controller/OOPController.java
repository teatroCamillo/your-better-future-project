package your.better.future.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oop")
public class OOPController {

    @GetMapping
    String getOOP(){
        return "oop";
    }
}
