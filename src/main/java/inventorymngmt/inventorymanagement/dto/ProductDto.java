package inventorymngmt.inventorymanagement.dto;

import inventorymngmt.inventorymanagement.dto.CategoryDto;
import inventorymngmt.inventorymanagement.enums.ProductUnit;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private Integer quantityInStock;
    @NotNull
    private CategoryDto category;
    @NotBlank(message = "Product is a required field")
    @Size(max = 100, min = 2)
    private String productName;
    @NotNull
    @Min(value=1)
    private Integer lowLimitAlert;
    @NotNull
    private ProductUnit productUnit;
}
