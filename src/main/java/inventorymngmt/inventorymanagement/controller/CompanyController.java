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
        boolean titleExists = companyService.titleExists(company.getTitle());

        if(titleExists){
            throw new RuntimeException("A company with the same title exists");
        } else {
            companyService.saveCompany(company);
        }
        return ResponseEntity.ok(new ResponseWrapper("Successfully saved company", HttpStatus.CREATED));
    }

    @PutMapping("/activate/{id}")
     public ResponseEntity<ResponseWrapper> activateCompany(@PathVariable Long id){
        return ResponseEntity.ok(new ResponseWrapper("Company activated", HttpStatus.OK, companyService.activate(id)));
     }

    @PutMapping("/deactivate/{id}")
    public ResponseEntity<ResponseWrapper> deactivateCompany(@PathVariable Long id){
        return ResponseEntity.ok(new ResponseWrapper("Company deactivated", HttpStatus.OK, companyService.deActivate(id)));
    }
}
