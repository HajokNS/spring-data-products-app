package org.hajokns.service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.AllArgsConstructor;
import org.hajokns.entity.Category;
import org.hajokns.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(long id) {
        return categoryRepository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Category with ID " + id + " not found"));
    }

    public Category getCategoryByTitle(String title) {
        return categoryRepository.findByTitle(title).orElseThrow(
            () -> new EntityNotFoundException("Category with title " + title + " not found"));
    }
}
