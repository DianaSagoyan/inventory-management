package inventorymngmt.inventorymanagement.repository;

import inventorymngmt.inventorymanagement.entity.InvoiceProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface InvoiceProductRepository extends JpaRepository<InvoiceProduct, Long> {
    Optional<InvoiceProduct> findInvoiceProductById(Long id);
}
