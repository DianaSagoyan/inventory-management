package inventorymngmt.inventorymanagement.dto;

import inventorymngmt.inventorymanagement.enums.InvoiceStatus;
import inventorymngmt.inventorymanagement.enums.InvoiceType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDto {
    private Long id;
    @ReadOnlyProperty
    private String invoiceNo;
    @NotNull(message = "This is a required field.")
    private ClientVendorDto clientVendor;
    @DateTimeFormat(pattern = "MMMM dd, yyyy")
    private Date date;
    private BigDecimal price;
    private BigDecimal tax;
    private BigDecimal totalPrice;
    private List<InvoiceProductDto> invoiceProducts;
    private Integer quantity;
    private InvoiceStatus invoiceStatus;
    private InvoiceType invoiceType;
}
