package your.better.future.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/j-basics")
public class JBasicsController {

    @GetMapping
    String getJBasics(){
        return "j-basics";
    }
    
    @GetMapping("/first-program")
    String getFirstProgram(){
        return "j-basics-t/first-program";
    }
    
}
