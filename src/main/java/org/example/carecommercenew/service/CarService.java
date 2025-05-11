package org.example.carecommercenew.service;

import org.example.carecommercenew.model.Cars;
import org.example.carecommercenew.repo.CarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {
    private CarsRepo carsRepo;


    @Autowired
    public void CarsRepo(CarsRepo carsRepo) {
        this.carsRepo = carsRepo;
    }
    @Override
    public List<Cars> getAllCars() {
        return carsRepo.findAll();
    }

    @Override
    public Cars getCarsById(int id) {
        return carsRepo.findById(id).orElseThrow(()->new RuntimeException("Car not found"));
    }

    @Override
    public Cars addCar(Cars cars) {
        return carsRepo.save(cars);
    }

    @Override
    public void deleteCar(Cars id) {
        carsRepo.delete(id);
    }
}
