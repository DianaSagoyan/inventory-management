package inventorymngmt.inventorymanagement.converter;

import inventorymngmt.inventorymanagement.dto.CategoryDto;
import inventorymngmt.inventorymanagement.service.CategoryService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryDtoConverter implements Converter<String, CategoryDto> {

    private final CategoryService categoryService;

    public CategoryDtoConverter(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public CategoryDto convert(String source) {
        if(source == null || source.equals("")) return null;
        return categoryService.findCategoryById(Long.parseLong(source));
    }
}
