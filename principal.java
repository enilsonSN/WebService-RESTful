/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author enilson
 */
@Path("caminho")
public class principal {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of principal
     */
    public principal() {
    }

    /**
     * Retrieves representation of an instance of ws.principal
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        return "Web Service RESTful - Ola Mundo !! ";
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("potencia/{N1}/{N2}")
    public String getPotencia(@PathParam("N1") int N1, @PathParam("N2") int N2){
        double resp= Math.pow(N1,N2);
        return "Potencia: "+N1+ "^"+N2+" igual a "+ resp;
    }

    /**
     * PUT method for updating or creating an instance of principal
     * @param content representation for the resource
     */
    
}
