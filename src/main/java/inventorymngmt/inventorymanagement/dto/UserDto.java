package inventorymngmt.inventorymanagement.dto;

import inventorymngmt.inventorymanagement.entity.Company;
import inventorymngmt.inventorymanagement.entity.Role;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    @NotNull(message = "Please select a customer")
    private Company company;
    @NotNull (message = "Please select a role")
    private Role role;
    @NotBlank(message = "First Name is a required field.")
    @Size(max = 50, min = 2, message = "First Name should be 2-50 characters long.")
    private String firstName;
    @NotBlank(message = "First Name is a required field.")
    @Size(max = 50, min = 2, message = "First Name should be 2-50 characters long.")
    private String lastName;
    @NotBlank(message = "User Name is a required field.")
    @Email(message = "Email is a required field.")
    private String userName;
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" // +111 (202) 555-0125  +1 (202) 555-0125
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"                                  // +111 123 456 789
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$", message = "Phone number is required field and may be in any valid phone number format.")
    private String phone;
    @NotBlank(message = "Password is a required field.")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])" +
                    "(?=.*([ -/]|[:-@]|[Z-_]|[{-~]))(?=\\S+$).{4,}$",
            message = "Password must contain at least: " +
                    "1 lowercase, " +
                    "1 uppercase, " +
                    "1 special, " +
                    "1 digit")
    private String password;
    @NotBlank (message = "Password needs to match")
    private String confirmPassword;

    private boolean isOnlyAdmin;

}
