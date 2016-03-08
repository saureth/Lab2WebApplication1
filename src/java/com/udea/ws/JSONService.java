package com.udea.ws;

import com.udea.POJO;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author santiago.sanmartin
 */

@Path("/json/metallica")

public class JSONService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of JSONService
     */
    public JSONService() {
    }

    /**
     * Retrieves representation of an instance of com.udea.ws.JSONService
     * @return an instance of java.lang.String
     */
    
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    
    public POJO getTrackInJSON(){
        POJO track = new POJO();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");
        return track;
    }
    
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of JSONService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
