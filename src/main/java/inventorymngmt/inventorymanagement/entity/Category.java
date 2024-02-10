package inventorymngmt.inventorymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category extends BaseEntity{
    private String description;
    @ManyToOne
    private Company company;
}
