package inventorymngmt.inventorymanagement.service.impl;

import inventorymngmt.inventorymanagement.dto.CompanyDto;
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
}
