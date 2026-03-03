package com.example.demo.strategy;
import org.springframework.stereotype.Component;

public interface TaxStrategy {
    Double calcularImposto(Double valor);
    String getPais();
}

@Component
class BrasilTax implements TaxStrategy {
    public Double calcularImposto(Double valor) { return valor * 0.15; }
    public String getPais() { return "BRA"; }
}