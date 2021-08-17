package com.damte.sample.docker.repository;

import com.damte.sample.docker.model.FruitModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FruitRepository extends MongoRepository<FruitModel, String> {
}
