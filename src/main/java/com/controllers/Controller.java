package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hola")
    public String decirHola() {
        return "Hola Mundo";
    }

    @GetMapping("/hola_people")
    public String decirHolaPeople() {
        return "Hola People";
    }

    @GetMapping("/city")
    public String decirHolaCity() {
        return "Hola City";
    }

}


