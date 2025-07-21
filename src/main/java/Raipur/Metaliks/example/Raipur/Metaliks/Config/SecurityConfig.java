package Raipur.Metaliks.example.Raipur.Metaliks.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // NO @Autowired WebConfig here!

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // This line tells Spring Security to find and apply the CORS
            // configuration from another bean (like the one in WebConfig).
            .cors(withDefaults()) 

            .csrf(csrf -> csrf.disable()) 
            
            .authorizeHttpRequests(authz -> authz
                // Make sure your public endpoints match your API routes
                .requestMatchers("/api/login", "/api/register","/api/*").permitAll() 
                .anyRequest().authenticated() 
            );

        return http.build();
    }
}