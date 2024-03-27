package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.UserDto;
import inventorymngmt.inventorymanagement.entity.User;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.UserRepository;
import inventorymngmt.inventorymanagement.service.SecurityService;
import inventorymngmt.inventorymanagement.service.UserService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MapperUtil mapper;

    private final SecurityService securityService;

    public UserServiceImpl(UserRepository userRepository, MapperUtil mapper, SecurityService securityService) {
        this.userRepository = userRepository;
        this.mapper = mapper;
        this.securityService = securityService;
    }

    @Override
    public UserDto findUserByUsername(String userName) {
        return mapper.convert(userRepository.findUserByUsername(userName), new UserDto());
    }

    @Override
    public List<UserDto> listAllUsers() {
        return userRepository.listAllNotDeletedAndActiveCompanyUsers().stream()
                .map(user -> {
//                    boolean isAdmin = user.getRole().getDescription().equals("Admin");
                    UserDto userDto = mapper.convert(user, new UserDto());
//                    userDto.setOnlyAdmin(isAdmin);
                    return userDto;
                })
                .collect(Collectors.toList());
    }
}
