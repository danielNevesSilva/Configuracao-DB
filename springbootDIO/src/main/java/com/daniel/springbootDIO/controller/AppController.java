package com.daniel.springbootDIO.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMenssage;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;
    @GetMapping("/")
    public String getAppMenssage(){
        return appMenssage;
    }


    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable(){
        return " A seguinte de ambiente foi passada" + dbEnvironmentVariable;
    }
}
