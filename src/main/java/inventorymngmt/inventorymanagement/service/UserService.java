package inventorymngmt.inventorymanagement.service;


import inventorymngmt.inventorymanagement.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto findUserByUsername(String userName);

    List<UserDto> listAllUsers();
}
