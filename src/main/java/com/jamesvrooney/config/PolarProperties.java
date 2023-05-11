package com.jamesvrooney.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "polar")
@Component
@Getter
@Setter
public class PolarProperties {

    /**
     * A message to welcome users.
     */
    private String greeting;

//    public String getGreeting() {
//        return greeting;
//    }

//    public void setGreeting(String greeting) {
//        this.greeting = greeting;
//    }

}
