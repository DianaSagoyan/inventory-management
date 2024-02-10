package inventorymngmt.inventorymanagement.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class AddressDto {
    private Long id;

    private String city;
    @NotNull(message = "Country is a required field")
    private String country;
    @NotNull(message = "State is a required field")
    @Size(max = 50, min = 2, message = "State should be 2-50 characters long.")
    private String state;
    @NotNull(message = "Zipcode is a required field")
    @Pattern(regexp = "^\\d{5}-\\d{4}$",
            message = "Zipcode should have a valid format. format " +
                    "\"xxxxx-xxxx\" 5 digit + dash + 4 digit")
    private String zipcode;
    @NotNull(message = "Address is a required field")
    @Size(max = 100, min = 2, message = "Address shou;d be 2-100 characters long")
    private String street1;
    @Size(max = 100, min = 2, message = "Address shou;d be 2-100 characters long")
    private String street2;
}
