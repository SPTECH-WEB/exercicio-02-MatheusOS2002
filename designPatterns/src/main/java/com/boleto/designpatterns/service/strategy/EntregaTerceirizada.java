package com.boleto.designpatterns.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaTerceirizada implements EntregaStrategy {

    @Override
    public double calcular(double peso) {
        return peso * 1.5;
    }

    @Override
    public String tipo() {
        return "terceirizada";
    }
}
