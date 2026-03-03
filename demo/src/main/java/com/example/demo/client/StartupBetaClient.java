package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Map;

@FeignClient(name = "startupBeta", url = "http://run.mocky.io/v3/93895e7c-87d8-4d37-9759-33534d0b2f56")
public interface StartupBetaClient {
    @GetMapping
    List<Map<String, Object>> buscarVendas();
}