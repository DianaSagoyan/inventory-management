package inventorymngmt.inventorymanagement.entity;

import inventorymngmt.inventorymanagement.enums.ProductUnit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseEntity{
    private Integer quantityInStock;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    private String productName;
    private Integer lowLimitAlert;
    @Enumerated(EnumType.STRING)
    private ProductUnit productUnit;
}
