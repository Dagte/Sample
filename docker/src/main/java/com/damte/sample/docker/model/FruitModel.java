package com.damte.sample.docker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FruitModel {

    @Id
    private String id;
    private String name;
    private String color;

    public FruitModel setId(String id) {
        this.id = id;
        return this;
    }

    public FruitModel setName(String name) {
        this.name = name;
        return this;
    }

    public FruitModel setColor(String color) {
        this.color = color;
        return this;
    }
}
