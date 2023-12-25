package com.example.parameternameresolution

import org.example.resolver.Resolver
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ParameterNameResolutionApplication

fun main(args: Array<String>) {
    val context = runApplication<ParameterNameResolutionApplication>(*args)
    val resolver = context.getBean(Resolver::class.java)
    resolver.resolveParameterName()
}
