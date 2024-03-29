package inventorymngmt.inventorymanagement.converter;

import inventorymngmt.inventorymanagement.dto.CompanyDto;
import inventorymngmt.inventorymanagement.service.CompanyService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CompanyDtoConverter implements Converter<String, CompanyDto> {

    private final CompanyService companyService;

    public CompanyDtoConverter(CompanyService companyService) {
        this.companyService = companyService;
    }

    @Override
    public CompanyDto convert(String source) {
        if(source == null || source.equals("")) return null;

        return companyService.findCompanyById(Long.parseLong(source));
    }
}
