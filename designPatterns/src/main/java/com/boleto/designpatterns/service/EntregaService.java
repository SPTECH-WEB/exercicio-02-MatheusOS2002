package com.boleto.designpatterns.service;

import org.springframework.stereotype.Component;

@Component
public interface EntregaService {
    double calcular(double peso, String modalidade);
}
