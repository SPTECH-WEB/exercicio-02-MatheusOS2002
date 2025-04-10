package com.boleto.designpatterns.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaExpressa implements EntregaStrategy {

    @Override
    public double calcular(double peso) {
        return peso * 1.3;
    }

    @Override
    public String tipo() {
        return "expressa";
    }
}
