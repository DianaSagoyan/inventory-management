package inventorymngmt.inventorymanagement.config;

import inventorymngmt.inventorymanagement.service.SecurityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final SecurityService securityService;

    public SecurityConfig(SecurityService securityService) {
        this.securityService = securityService;
    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        return http.authorizeRequests()
//                .antMatchers("/companies/**").permitAll()
//                .and()
//                .rememberMe().userDetailsService(securityService)
//                .and().build();
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        return http.authorizeRequests()
                .requestMatchers("/companies/**")
                .permitAll()
                .and()
                .rememberMe().userDetailsService(securityService)
                .and().build();
    }
}
