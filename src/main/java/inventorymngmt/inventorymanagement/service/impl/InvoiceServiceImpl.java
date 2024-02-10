package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.InvoiceDto;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.InvoiceRepository;
import inventorymngmt.inventorymanagement.service.InvoiceService;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final MapperUtil mapper;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository, MapperUtil mapper) {
        this.invoiceRepository = invoiceRepository;
        this.mapper = mapper;
    }

    @Override
    public InvoiceDto findInvoiceById(Long id) {
        return mapper.convert(invoiceRepository.findInvoiceById(id), new InvoiceDto());
    }
}
