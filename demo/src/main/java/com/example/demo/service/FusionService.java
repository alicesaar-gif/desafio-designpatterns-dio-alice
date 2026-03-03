package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FusionService {

    public List<Map<String, Object>> consolidar(String pais) {
        List<Map<String, Object>> lista = new ArrayList<>();
        
        Map<String, Object> venda = new HashMap<>();
        venda.put("item", "Teste Local Alice");
        venda.put("pais", pais);
        venda.put("valor", 100.0);
        
        lista.add(venda);
        return lista;
    }
}