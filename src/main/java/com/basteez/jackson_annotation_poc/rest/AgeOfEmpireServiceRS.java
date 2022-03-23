package com.basteez.jackson_annotation_poc.rest;

import com.basteez.jackson_annotation_poc.pojo.Civilization;
import com.basteez.jackson_annotation_poc.pojo.CivilizationList;
import com.basteez.jackson_annotation_poc.service.AgeOfEmpiresService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/")
@ApplicationScoped
public class AgeOfEmpireServiceRS {

    @Inject
    @RestClient
    AgeOfEmpiresService aoeService;

    @GET
    @Path("civilizations")
    public Response getCivilizations() throws Exception {
        try{
            CivilizationList civilizations = aoeService.getCivilizations();
            return Response.ok().entity(civilizations).build();
        }catch (Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }

    @GET
    @Path("/civilization/{id}")
    public Response getSingleCivilization(@PathParam("id") Integer id) throws Exception {
        try{
           Civilization civilization = aoeService.getSingleCivilization(id);
           return Response.ok().entity(civilization).build();
        }catch (Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }

}
