/**Desarrollado por
    Edwin Geovani Pérez Martínez
    Fecha de modificacion 02 de octubre de 2024*/

    /*Bajo la instrucion del ing.Jhonathan Josué García Cuque*/

package com.notasapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class NotasBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotasBackendApplication.class, args);
    }

    // Configuración de CORS global
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000") // Permitir solicitudes desde el frontend en localhost:3000
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos permitidos
                        .allowedHeaders("*") // Permitir todos los headers
                        .allowCredentials(true); // Permitir el uso de cookies (opcional, según necesidad)
            }
        };
    }
}

