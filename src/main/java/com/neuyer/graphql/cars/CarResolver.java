package com.neuyer.graphql.cars;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarResolver implements GraphQLQueryResolver {

    @Autowired
    private CarRepository carRepository;

    public Car findCarByModel(String model) {
        return carRepository.findByModelName(model);
    }

    public List<Car> findAllCars() {
       return carRepository.findAll();
    }

}
