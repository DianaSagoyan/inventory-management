package inventorymngmt.inventorymanagement.dto;

import inventorymngmt.inventorymanagement.enums.CompanyStatus;
import jakarta.validation.constraints.NotBlank;
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
public class CompanyDto {
    private Long id;
    @NotBlank(message = "Title is a required field")
    @Size(min = 2, max = 100, message = "Title should be 2-100 characters long")
    private String title;
    @NotBlank(message = "Phone number is a required field")
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" // +111 (202) 555-0125  +1 (202) 555-0125
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"                                  // +111 123 456 789
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$",
            message = "Phone number is required field and may be in any valid phone number format.")
    private String phone;
    private CompanyStatus status;
    @NotBlank(message = "Address is a required field")
    @Size(min = 2, max = 100, message = "Address should be 2-100 characters long")
    private AddressDto address;
    @NotBlank(message = "Website is a required field.")
    @Size(min = 2, max = 100, message = "Website should be 2-100 characters long")
    @Pattern(regexp = "^http(s{0,1})://[a-zA-Z0-9/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9/\\&\\?\\=\\-\\.\\~\\%]*",
            message = "Website should have a valid format.")
    private String website;
}
