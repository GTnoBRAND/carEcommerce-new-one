package org.example.carecommercenew.repo;

import org.example.carecommercenew.model.Contact_requests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contact_requestsRepo extends JpaRepository<Contact_requests, Integer> {
}
