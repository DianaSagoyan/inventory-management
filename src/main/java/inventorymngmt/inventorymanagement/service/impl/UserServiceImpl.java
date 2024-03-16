package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.UserDto;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.UserRepository;
import inventorymngmt.inventorymanagement.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MapperUtil mapper;

    public UserServiceImpl(UserRepository userRepository, MapperUtil mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public UserDto findUserByUsername(String userName) {
        return mapper.convert(userRepository.findUserByUsername(userName), new UserDto());
    }
}
