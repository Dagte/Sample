package com.damte.sample.docker.request;

import com.damte.sample.docker.model.FruitModel;
import org.bson.types.ObjectId;

public class FruitRequest {
    private String name;
    private String color;

    public FruitRequest setName(String name) {
        this.name = name;
        return this;
    }

    public FruitRequest setColor(String color) {
        this.color = color;
        return this;
    }

    public FruitModel toFruitModel(){
        return new FruitModel()
                .setId(new ObjectId().toHexString())
                .setColor(color)
                .setName(name);
    }
}
