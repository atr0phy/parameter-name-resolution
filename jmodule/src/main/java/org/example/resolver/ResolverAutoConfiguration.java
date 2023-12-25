package org.example.resolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResolverAutoConfiguration {
    @Bean
    public Resolver resolver(ParameterNameResolver parameterNameResolver) {
        return new Resolver(
                parameterNameResolver
        );
    }
}
