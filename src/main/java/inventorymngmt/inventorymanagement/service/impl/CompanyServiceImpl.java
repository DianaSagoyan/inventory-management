package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.CompanyDto;
import inventorymngmt.inventorymanagement.entity.Company;
import inventorymngmt.inventorymanagement.enums.CompanyStatus;
import inventorymngmt.inventorymanagement.mapper.MapperUtil;
import inventorymngmt.inventorymanagement.repository.CompanyRepository;
import inventorymngmt.inventorymanagement.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final MapperUtil mapper;

    public CompanyServiceImpl(CompanyRepository companyRepository, MapperUtil mapper) {
        this.companyRepository = companyRepository;
        this.mapper = mapper;
    }

    @Override
    public CompanyDto findCompanyById(Long id) {
        return mapper.convert(companyRepository.findCompanyById(id), new CompanyDto());
    }

    @Override
    public List<CompanyDto> allCompanies() {
        return companyRepository.findAll().stream().map(company -> mapper.convert(company, new CompanyDto())).collect(Collectors.toList());
    }

    @Override
    public CompanyDto saveCompany(CompanyDto companyDto) {
//        companyDto.setStatus(CompanyStatus.PASSIVE);
        Company company = mapper.convert(companyDto, new Company());
        companyRepository.save(company);
        return companyDto;
    }

    @Override
    public boolean titleExists(String title) {
        return companyRepository.findAll().stream()
                .filter(company -> company.getIsDeleted().equals(false))
                .anyMatch(company -> company.getTitle().equals(title));
    }

}
