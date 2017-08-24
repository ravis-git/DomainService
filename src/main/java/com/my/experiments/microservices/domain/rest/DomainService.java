package com.my.experiments.microservices.domain.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ravipalakodeti on 8/22/17.
 */
@Path("hello")
public class DomainService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getStatus() {
        return "{\"app\": \"Domain\"}";
    }
}
