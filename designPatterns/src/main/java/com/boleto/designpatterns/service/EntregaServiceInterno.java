package com.boleto.designpatterns.service;

import com.boleto.designpatterns.service.strategy.EntregaStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Interno")
public class EntregaServiceInterno implements EntregaService {
    private final List<EntregaStrategy> estrategias;

    public EntregaServiceInterno(List<EntregaStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    @Override
    public double calcular(double peso, String modalidade) {
        return estrategias.stream()
                .filter(estrategia -> estrategia.tipo().equalsIgnoreCase(modalidade))
                .findFirst()
                .orElseThrow( () -> new IllegalArgumentException("Tipo de frete inválido"))
                .calcular(peso);
    }
}
