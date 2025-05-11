package org.example.carecommercenew.repo;

import org.example.carecommercenew.model.SearchHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Search_history extends JpaRepository<SearchHistory, Integer> {
}
