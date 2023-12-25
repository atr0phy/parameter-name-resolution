package com.example.parameternameresolution

import org.example.resolver.ParameterNameResolver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ParameterNameResolverAutoConfiguration {
    @Bean
    fun parameterNameResolver(): ParameterNameResolver {
        return ParameterNameResolverA()
    }

    @Bean
    fun parameterNameResolverB(): ParameterNameResolver {
        return ParameterNameResolverB()
    }
}
