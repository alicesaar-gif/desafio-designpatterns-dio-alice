package com.example.demo.controller;

import com.example.demo.service.FusionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/fusion")
public class FusionController {

    @Autowired
    private FusionService fusionService;

    @GetMapping("/{pais}")
    public List<Map<String, Object>> getFusion(@PathVariable String pais) {
        return fusionService.consolidar(pais);
    }
}