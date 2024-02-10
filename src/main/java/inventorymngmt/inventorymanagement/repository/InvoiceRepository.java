package inventorymngmt.inventorymanagement.repository;

import inventorymngmt.inventorymanagement.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    Optional<Invoice> findInvoiceById(Long id);
}
