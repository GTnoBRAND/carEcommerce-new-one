package org.example.carecommercenew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Search_history extends JpaRepository<Search_history, Integer> {
}
