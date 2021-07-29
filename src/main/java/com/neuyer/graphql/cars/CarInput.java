package com.neuyer.graphql.cars;

import lombok.Data;

@Data
public class CarInput {
    private String modelName;
    private String colorName;
    private String brandName;
    private int numberOfSeats;
    private Float numberOfHorses;
}
