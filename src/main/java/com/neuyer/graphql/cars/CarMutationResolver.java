package com.neuyer.graphql.cars;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CarMutationResolver implements GraphQLMutationResolver {

    @Autowired
    CarRepository carRepository;

    public Car registerNewCar(CarInput carInput) {
        Car newCar = Car.builder()
                .uuid(String.valueOf(UUID.randomUUID()))
                .brandName(carInput.getBrandName())
                .colorName(carInput.getColorName())
                .modelName(carInput.getModelName())
                .numberOfHorses(carInput.getNumberOfHorses())
                .numberOfSeats(carInput.getNumberOfSeats())
                .build();
        return carRepository.save(newCar);
    }
}
