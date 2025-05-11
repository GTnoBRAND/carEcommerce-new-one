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
public class Search_history {

    @Id
    private int id;
    private int user_id;
    private String query;
    private LocalDateTime searched_at;
}
