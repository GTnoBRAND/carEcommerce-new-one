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
public class Parts {

    @Id
    private int id;
    private String name;
    private String description;
    private double price;
    private String image_url;
    private Boolean in_stock;
    private LocalDateTime created_at;
}
