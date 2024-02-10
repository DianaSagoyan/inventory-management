package inventorymngmt.inventorymanagement.entity;

import inventorymngmt.inventorymanagement.dto.AddressDto;
import inventorymngmt.inventorymanagement.enums.CompanyStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "companies")
public class Company extends BaseEntity{
    private String title;
    private String phone;
    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Address address;
    private String website;

    @OneToMany(mappedBy = "company")
    private List<ClientVendor> clientVendor;
}
