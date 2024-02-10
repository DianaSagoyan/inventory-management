package inventorymngmt.inventorymanagement.service;

import inventorymngmt.inventorymanagement.dto.InvoiceDto;

public interface InvoiceService {
    InvoiceDto findInvoiceById(Long id);
}
