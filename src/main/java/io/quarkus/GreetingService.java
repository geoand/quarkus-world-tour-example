package io.quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Singleton;

@Singleton
public class GreetingService {

    private final String prefix;

    public GreetingService(@ConfigProperty(name = "greeting.prefix") String prefix) {
        this.prefix = prefix;
    }

    public String greet(String name) {
        return prefix + " " + name;
    }
}
