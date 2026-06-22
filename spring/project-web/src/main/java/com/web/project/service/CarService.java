package com.web.project.service;

import com.web.project.model.Car;
import com.web.project.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public List<Car> getAllCars(){
        List<Car> cars= carRepository.getAllCars();
        return cars;
    }

}
