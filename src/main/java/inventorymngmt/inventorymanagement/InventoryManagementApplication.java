package inventorymngmt.inventorymanagement;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
//@ComponentScan("inventorymngmt.inventorymanagement.repository")
public class InventoryManagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(InventoryManagementApplication.class, args);

    }
        @Bean
        public ModelMapper mapper(){
            return new ModelMapper();
        }

//        @Bean
//        public PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();
//        }

}
