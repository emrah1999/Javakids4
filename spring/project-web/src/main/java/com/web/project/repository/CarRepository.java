package com.web.project.repository;

import com.web.project.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepository {
    public List<Car> getAllCars() {
        return List.of(
                new Car("Toyota", "Camry", 2020),
                new Car("Honda", "Civic", 2019),
                new Car("Ford", "Mustang", 2021)
        );
    }
}
