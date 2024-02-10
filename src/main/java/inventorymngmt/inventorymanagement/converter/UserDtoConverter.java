package inventorymngmt.inventorymanagement.converter;

import inventorymngmt.inventorymanagement.dto.UserDto;
import inventorymngmt.inventorymanagement.service.UserService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter implements Converter<String, UserDto> {

    private final UserService userService;

    public UserDtoConverter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDto convert(String source) {
        if(source == null || source.equals("")) return null;
        return userService.findUserByUsername(source);
    }
}
