package inventorymngmt.inventorymanagement.service;

import inventorymngmt.inventorymanagement.dto.CategoryDto;

public interface CategoryService {
    CategoryDto findCategoryById(Long id);
}
