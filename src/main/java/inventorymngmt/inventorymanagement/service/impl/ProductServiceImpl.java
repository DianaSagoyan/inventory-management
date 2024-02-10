package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.ProductDto;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.ProductRepository;
import inventorymngmt.inventorymanagement.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    public ProductServiceImpl(ProductRepository productRepository, MapperUtil mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    private final ProductRepository productRepository;
     private final MapperUtil mapper;

    @Override
    public ProductDto findProductById(Long id) {
        return mapper.convert(productRepository.findProductById(id), new ProductDto());
    }
}
