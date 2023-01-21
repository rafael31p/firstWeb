package com.rafael31p.firtsWeb;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HolaMundoController {
    @GetMapping("/Hola")
    public String hi(){
        return "Hi, hi";
    }
}
