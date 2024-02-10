package inventorymngmt.inventorymanagement.dto;

import inventorymngmt.inventorymanagement.entity.Company;
import inventorymngmt.inventorymanagement.enums.ClientVendorType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientVendorDto {
    private Long id;
    @NotBlank(message = "Company Name is a required field.")
    @Size(max = 50, min = 2, message = "Company Name should be 2-50 characters long.")
    private String clientVendor;
    @NotNull(message = "Please select type.")
    private ClientVendorType type;
    @NotBlank(message = "Phone is a required field.")
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" // +111 (202) 555-0125  +1 (202) 555-0125
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"                                  // +111 123 456 789
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$",
            message = "Phone number is required field and may be in any valid phone number format.")
    // +111 123 45 67 89
    private String phone;
    @NotBlank(message = "Website is a required field.")
    @Size(max = 100, min = 2, message = "Website should be 2-100 characters long.")
    @Pattern(regexp = "^http(s{0,1})://[a-zA-Z0-9/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9/\\&\\?\\=\\-\\.\\~\\%]*",
            message = "Website should have a valid format.")
    private String website;
    private AddressDto address;
    private Company company;
}
