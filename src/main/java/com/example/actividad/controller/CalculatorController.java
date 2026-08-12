package com.example.actividad.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CalculatorController {

    @PostMapping("/api/sum")
    public Map<String, Object> sum(@RequestBody SumRequest request) {
        int result = request.a() + request.b();
        return Map.of(
            "a", request.a(),
            "b", request.b(),
            "result", result
        );
    }

    public record SumRequest(int a, int b) {}
}