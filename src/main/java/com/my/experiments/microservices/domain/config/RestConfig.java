package com.my.experiments.microservices.domain.config;

import com.my.experiments.microservices.chassis.config.JerseyConfig;
import com.my.experiments.microservices.domain.rest.DomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by ravipalakodeti on 8/22/17.
 */
@Component
@Slf4j
@ApplicationPath("domain-api")
public class RestConfig extends JerseyConfig {

    public RestConfig() {
        super();
        log.info(" == jersey initialized == ");
        register(DomainService.class);
    }
}
