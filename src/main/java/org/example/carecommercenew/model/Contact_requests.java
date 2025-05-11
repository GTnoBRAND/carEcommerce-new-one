package org.example.carecommercenew.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact_requests {

    @Id
    private int id;
    private String name;
    private String email;
    private String message;
    private LocalDateTime created_at;
}
