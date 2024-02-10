package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.ClientVendorDto;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.ClientVendorRepository;
import inventorymngmt.inventorymanagement.service.ClientVendorService;
import org.springframework.stereotype.Service;

@Service
public class ClientVendorServiceImpl implements ClientVendorService {

    private final ClientVendorRepository clientVendorRepository;
    private  final MapperUtil mapper;

    public ClientVendorServiceImpl(ClientVendorRepository clientVendorRepository, MapperUtil mapper) {
        this.clientVendorRepository = clientVendorRepository;
        this.mapper = mapper;
    }

    @Override
    public ClientVendorDto findClientVendorById(Long id) {
        return mapper.convert(clientVendorRepository.findClientVendorById(id), new ClientVendorDto());
    }
}
