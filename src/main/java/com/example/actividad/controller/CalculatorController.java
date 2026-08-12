package com.example.actividad.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CalculatorController {

    @PostMapping("/api/sum")
    public ResponseEntity<Map<String, Object>> sum(@RequestBody SumRequest request) {
        if (request.a() == null || request.b() == null) {
            return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("error", "Los campos 'a' y 'b' son obligatorios"));
        }

        int result = request.a() + request.b();
        return ResponseEntity.ok(Map.of(
            "a", request.a(),
            "b", request.b(),
            "result", result
        ));
    }

    public record SumRequest(Integer a, Integer b) {}
}