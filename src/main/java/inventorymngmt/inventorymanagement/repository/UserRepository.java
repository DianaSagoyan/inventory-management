package inventorymngmt.inventorymanagement.repository;

import inventorymngmt.inventorymanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByUsername(String userName);

    @Query("select u from User u where u.isDeleted = false and u.company.companyStatus = 'ACTIVE'" +
            "and u.company.isDeleted = false order by u.company.title, u.role.description")
    List<User> listAllNotDeletedAndActiveCompanyUsers();
}
