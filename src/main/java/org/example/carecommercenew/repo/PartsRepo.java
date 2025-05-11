package org.example.carecommercenew.repo;

import org.example.carecommercenew.model.Parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsRepo extends JpaRepository<Parts, Integer> {
}
