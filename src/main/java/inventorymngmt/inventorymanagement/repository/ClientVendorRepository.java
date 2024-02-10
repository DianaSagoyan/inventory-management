package inventorymngmt.inventorymanagement.repository;

import inventorymngmt.inventorymanagement.entity.ClientVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface ClientVendorRepository extends JpaRepository<ClientVendor, Long> {
    Optional<ClientVendor> findClientVendorById(Long id);
}
