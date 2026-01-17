package com.dam.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class EstadoControlador {

    @GetMapping("/")
    public String inicio() {
        return "Fin de la práctica: CI/CD con GitHub Actions y AWS Elastic Beanstalk";
    }
    @GetMapping("/api/estado")
    public Map<String, Object> estado() {
        return Map.of(
                "estado", "OK",
                "servicio", "arquitecturas-dam-ci-cd-api",
                "mensaje", "API operativa"
        );
    }
}
