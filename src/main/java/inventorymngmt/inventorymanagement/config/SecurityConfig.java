package inventorymngmt.inventorymanagement.config;

import inventorymngmt.inventorymanagement.service.SecurityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig{

    private final SecurityService securityService;

    public SecurityConfig(SecurityService securityService) {
        this.securityService = securityService;
    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        return http.authorizeRequests()
//                .requestMatchers("/companies/**")
//                .permitAll()
////                .hasAnyAuthority("Root User")
//                .and()
//                .csrf(AbstractHttpConfigurer::disable)
//                .rememberMe().userDetailsService(securityService)
//                .and().build();
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        return http.authorizeHttpRequests(httpRequests -> httpRequests
                        .requestMatchers( "/companies/**").permitAll())
//                        .requestMatchers("/users/**").permitAll())
                .csrf(AbstractHttpConfigurer::disable)
                .rememberMe(remember -> remember
                        .userDetailsService(securityService))
                .build();
    }
}
