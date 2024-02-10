package inventorymngmt.inventorymanagement.repository;

import inventorymngmt.inventorymanagement.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findCategoryById(Long id);
}
