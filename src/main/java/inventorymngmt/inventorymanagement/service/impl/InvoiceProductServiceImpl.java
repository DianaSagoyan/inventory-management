package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.InvoiceProductDto;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.InvoiceProductRepository;
import inventorymngmt.inventorymanagement.service.InvoiceProductService;
import org.springframework.stereotype.Service;

@Service
public class InvoiceProductServiceImpl implements InvoiceProductService {

    private final InvoiceProductRepository invoiceProductRepository;
    private final MapperUtil mapper;

    public InvoiceProductServiceImpl(InvoiceProductRepository invoiceProductRepository, MapperUtil mapper) {
        this.invoiceProductRepository = invoiceProductRepository;
        this.mapper = mapper;
    }

    @Override
    public InvoiceProductDto findInvoiceProductById(Long id) {
        return mapper.convert(invoiceProductRepository.findInvoiceProductById(id), new InvoiceProductDto());
    }
}
