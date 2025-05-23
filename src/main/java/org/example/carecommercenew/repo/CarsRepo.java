package org.example.carecommercenew.repo;

import org.example.carecommercenew.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepo extends JpaRepository<Cars, Integer> {
}
