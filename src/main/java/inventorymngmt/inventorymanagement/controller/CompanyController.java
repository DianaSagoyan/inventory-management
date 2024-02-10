package inventorymngmt.inventorymanagement.controller;

import inventorymngmt.inventorymanagement.dto.ResponseWrapper;
import inventorymngmt.inventorymanagement.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getCompanies(){
        return ResponseEntity.ok(new ResponseWrapper("All Companies", HttpStatus.OK, companyService.allCompanies()));
    }
}
