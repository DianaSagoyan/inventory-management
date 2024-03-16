package inventorymngmt.inventorymanagement.controller;

import inventorymngmt.inventorymanagement.dto.CompanyDto;
import inventorymngmt.inventorymanagement.dto.ResponseWrapper;
import inventorymngmt.inventorymanagement.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public ResponseEntity<ResponseWrapper> createCompany(@RequestBody CompanyDto company){
        companyService.saveCompany(company);
        return ResponseEntity.ok(new ResponseWrapper("Successfully saved company", HttpStatus.CREATED));
    }
}
