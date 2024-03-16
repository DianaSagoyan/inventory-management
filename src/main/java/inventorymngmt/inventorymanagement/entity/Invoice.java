package inventorymngmt.inventorymanagement.entity;

import inventorymngmt.inventorymanagement.entity.config.BaseEntity;
import inventorymngmt.inventorymanagement.enums.InvoiceStatus;
import inventorymngmt.inventorymanagement.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "invoices")
public class Invoice extends BaseEntity {
    private String invoiceNo;
    @ManyToOne
    @JoinColumn(name = "client_vendor_id")
    private ClientVendor clientVendor;
    private Date date;
    @Enumerated(EnumType.STRING)
    private InvoiceStatus invoiceStatus;
    @Enumerated(EnumType.STRING)
    private InvoiceType invoiceType;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
