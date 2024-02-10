package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.CategoryDto;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.CategoryRepository;
import inventorymngmt.inventorymanagement.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final MapperUtil mapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, MapperUtil mapper) {
        this.categoryRepository = categoryRepository;
        this.mapper = mapper;
    }

    @Override
    public CategoryDto findCategoryById(Long id) {
        return mapper.convert(categoryRepository.findCategoryById(id), new CategoryDto());
    }
}
