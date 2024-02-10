package inventorymngmt.inventorymanagement.service;

import inventorymngmt.inventorymanagement.dto.ProductDto;

public interface ProductService {
    ProductDto findProductById(Long id);
}
