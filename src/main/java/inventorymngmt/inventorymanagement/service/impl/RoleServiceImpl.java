package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.RoleDto;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.RoleRepository;
import inventorymngmt.inventorymanagement.service.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final MapperUtil mapper;

    public RoleServiceImpl(RoleRepository roleRepository, MapperUtil mapper) {
        this.roleRepository = roleRepository;
        this.mapper = mapper;
    }

    @Override
    public RoleDto findRoleById(Long id) {
        return mapper.convert(roleRepository.findRoleById(id), new RoleDto());
    }
}
