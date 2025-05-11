package org.example.carecommercenew.service;

import org.example.carecommercenew.model.Cars;

import java.util.List;

public interface ICarService {
    List<Cars> getAllCars();
    Cars getCarsById(int id);
    Cars addCar(Cars cars);
    void deleteCar(Cars id);
}
