package inventorymngmt.inventorymanagement.service;


import inventorymngmt.inventorymanagement.dto.UserDto;

public interface UserService {
    UserDto findUserByUsername(String userName);
}
