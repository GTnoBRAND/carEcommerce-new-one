package org.example.carecommercenew.repo;

import org.example.carecommercenew.model.Blog_posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Blog_postsRepo extends JpaRepository<Blog_posts, Integer> {
}
