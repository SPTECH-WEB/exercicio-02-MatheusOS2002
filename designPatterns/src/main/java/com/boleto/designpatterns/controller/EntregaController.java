package com.boleto.designpatterns.controller;

import com.boleto.designpatterns.service.EntregaServiceInterno;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entregas")
public class EntregaController {
    private final EntregaServiceInterno entregaServiceInterno;

    public EntregaController(EntregaServiceInterno entregaServiceInterno) {
        this.entregaServiceInterno = entregaServiceInterno;
    }

    @GetMapping
    public String calcularEntregas(@RequestParam double peso, @RequestParam String modalidade) {
        double valor = entregaServiceInterno.calcular(peso, modalidade);
        return "Frete: (%.2f) para %.2fKg: %s".formatted(valor, peso, modalidade);
    }
}
