/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imon.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author muujig
 */

@Path("test")
public class TestResource {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTest() {
        String a = "Mongolia4455";
        return a;
    }
    
    @POST
    @Path("/{isdn}")
    @Produces(MediaType.APPLICATION_JSON)
    public String test(@PathParam("isdn") String isdn) {
        return "Post request for launch: " + isdn;
    }
    
}
