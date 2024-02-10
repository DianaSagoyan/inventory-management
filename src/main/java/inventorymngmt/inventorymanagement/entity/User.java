package inventorymngmt.inventorymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
//import javax.persistence.Entity;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity{
    @ManyToOne
    private Company company;
    @ManyToOne
    private Role role;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String userName;
    private String phone;
    private String password;
    private boolean enabled;
}
