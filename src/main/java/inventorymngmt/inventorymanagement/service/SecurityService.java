package inventorymngmt.inventorymanagement.service;

import inventorymngmt.inventorymanagement.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface SecurityService extends UserDetailsService {
    UserDto getLoggedInUser();
}
