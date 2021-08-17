package com.damte.sample.docker.controller;

import com.damte.sample.docker.model.FruitModel;
import com.damte.sample.docker.request.FruitRequest;
import com.damte.sample.docker.service.FruitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FruitController {

    private final FruitService fruitService;
    public FruitController(FruitService fruitService) {this.fruitService = fruitService;}

    @PostMapping("/fruits")
    public ResponseEntity addFruit(@RequestBody FruitRequest fruitRequest) {
//        log.info("Request : {}", fruitRequest);
        fruitService.saveFruit(fruitRequest.toFruitModel());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/fruits")
    public List<FruitModel> getAllFruit() {
        return fruitService.findAll();
    }
}