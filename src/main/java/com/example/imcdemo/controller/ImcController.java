package com.example.imcdemo.controller;

import com.example.imcdemo.service.ImcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//exemplo: http://localhost:8080/calculoimc?peso=12&altura=1.2
public class ImcController {
    @GetMapping(path = "/calculoimc")
    public float CalculoImc (@RequestParam float peso, @RequestParam float altura) {
       // return (float) (peso/Math.pow(altura,2));
         ImcService _service = new ImcService();
         return _service.ImcCalcular(peso,altura);
    }
}
