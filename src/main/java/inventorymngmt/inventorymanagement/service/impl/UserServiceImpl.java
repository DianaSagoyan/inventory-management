package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.UserDto;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.UserRepository;
import inventorymngmt.inventorymanagement.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<UserDto> listAllUsers() {
        return userRepository.listAllNotDeletedAndActiveCompanyUsers().stream()
                .map(user -> mapper.convert(user, new UserDto()))
                .collect(Collectors.toList());
    }
}
