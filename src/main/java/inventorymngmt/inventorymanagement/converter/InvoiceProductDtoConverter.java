package inventorymngmt.inventorymanagement.converter;

import inventorymngmt.inventorymanagement.dto.InvoiceProductDto;
import inventorymngmt.inventorymanagement.service.InvoiceProductService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InvoiceProductDtoConverter implements Converter<String, InvoiceProductDto> {

    private final InvoiceProductService invoiceProductService;

    public InvoiceProductDtoConverter(InvoiceProductService invoiceProductService) {
        this.invoiceProductService = invoiceProductService;
    }

    @Override
    public InvoiceProductDto convert(String source) {
        if(source == null || source.equals("")) return null;
        return invoiceProductService.findInvoiceProductById(Long.parseLong(source));
    }
}
