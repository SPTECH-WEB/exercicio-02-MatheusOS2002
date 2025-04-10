package com.boleto.designpatterns.service.adapter;

import com.boleto.designpatterns.service.EntregaService;
import org.springframework.stereotype.Service;

@Service("Externa")
public class EntregaAdapter implements EntregaService {
    private final EntregaExterna entregaExterna;

    public EntregaAdapter() {
        this.entregaExterna = new EntregaExterna();
    }

    @Override
    public double calcular(double peso, String modalidade) {
        return entregaExterna.calcular(peso);
    }
}
