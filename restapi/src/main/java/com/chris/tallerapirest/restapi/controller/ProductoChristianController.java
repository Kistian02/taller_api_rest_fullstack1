package com.chris.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoChristianController {

    @GetMapping("/saludar")
    public String saludo(){
        return "Hola, como estas?";
    }

    @GetMapping("/usuario/(id)")
    public String getUsuario(@PathVariable Long id){
        return "Hola usuario tu id es " + id;
    }
}
