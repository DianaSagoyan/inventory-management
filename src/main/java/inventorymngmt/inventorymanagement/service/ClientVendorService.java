package inventorymngmt.inventorymanagement.service;

import inventorymngmt.inventorymanagement.dto.ClientVendorDto;

public interface ClientVendorService {
    ClientVendorDto findClientVendorById(Long id);
}
