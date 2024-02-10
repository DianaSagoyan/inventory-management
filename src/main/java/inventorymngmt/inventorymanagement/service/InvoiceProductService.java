package inventorymngmt.inventorymanagement.service;

import inventorymngmt.inventorymanagement.dto.InvoiceProductDto;

public interface InvoiceProductService {
    InvoiceProductDto findInvoiceProductById(Long id);
}
