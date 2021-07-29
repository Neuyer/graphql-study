package com.neuyer.graphql.cars;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Car {

    @Id
    private String uuid;
    private String modelName;
    private String colorName;
    private String brandName;
    private int numberOfSeats;
    private Float numberOfHorses;

}
