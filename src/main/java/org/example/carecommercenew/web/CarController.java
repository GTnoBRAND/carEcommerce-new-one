package org.example.carecommercenew.web;

import org.example.carecommercenew.model.Cars;
import org.example.carecommercenew.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarService service;

    private CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public Collection<Cars> getAllCars() {
        return service.getAllCars();
    }
    @GetMapping("/{id}")
    public Cars getCarsById(@PathVariable int id) {
        return service.getCarsById(id);
    }

    @PostMapping()
    public ResponseEntity<Cars> addCars(@RequestBody Cars cars) {
        Cars newCar = service.addCar(cars);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Cars id) {
        service.deleteCar(id);
        return ResponseEntity.noContent().build();
    }
}
