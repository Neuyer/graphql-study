package com.neuyer.graphql.cars;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarRepository extends MongoRepository<Car, UUID> {

    public Car findByModelName(String modelName);
}
