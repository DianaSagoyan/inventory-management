package inventorymngmt.inventorymanagement.service;

import inventorymngmt.inventorymanagement.dto.CompanyDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
    CompanyDto findCompanyById(Long id);

    List<CompanyDto> allCompanies();

    CompanyDto saveCompany(CompanyDto companyDto);

    boolean titleExists(String title);
}
