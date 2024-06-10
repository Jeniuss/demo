package com.example.demo.service;

import com.example.demo.dao.ExperimentalRespository;
import com.example.demo.model.ExperimentalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperimentalService {
    @Autowired
    ExperimentalRespository experimentalRespository;

    public ExperimentalEntity getExperimental(Long id) {
        return experimentalRespository.findAllById(id).orElse(null);
    }

}
