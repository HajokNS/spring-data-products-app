package org.hajokns.repository;

import java.util.Optional;
import org.hajokns.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findById(long id);
    Optional<Category> findByTitle(String title);
}
