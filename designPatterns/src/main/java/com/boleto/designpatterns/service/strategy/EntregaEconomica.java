package com.boleto.designpatterns.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaEconomica implements EntregaStrategy {

    @Override
    public double calcular(double valorBase) {
        return valorBase * 1.1;
    }

    @Override
    public String tipo() {
        return "Entrega Econômica";
    }
}
