package com.example.demo.controller;

import com.example.demo.model.ExperimentalEntity;
import com.example.demo.model.QItem;
import com.example.demo.service.ExperimentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class ExperimentalController {

    @Autowired
    ExperimentalService experimentalService;

    @GetMapping("/experimental/{id}")
    public ExperimentalEntity getData(@PathVariable Long id) {
        return experimentalService.getExperimental(id);
    }
}
