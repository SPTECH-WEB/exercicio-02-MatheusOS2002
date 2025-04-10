package com.boleto.designpatterns.service.strategy;

public interface EntregaStrategy {
    double calcular(double peso);
    String tipo();
}
