package org.example.carecommercenew.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog_posts {

    @Id
    private int id;
    private String title;
    private String content;
    private String image_url;
    private LocalDate published_at;
    private LocalDate created_at;
}
