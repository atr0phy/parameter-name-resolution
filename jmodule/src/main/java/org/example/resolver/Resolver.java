package org.example.resolver;

public class Resolver {
    private final ParameterNameResolver parameterNameResolver;

    public Resolver(ParameterNameResolver parameterNameResolver) {
        this.parameterNameResolver = parameterNameResolver;
    }

    public void resolveParameterName() {
        parameterNameResolver.resolve();
    }
}
