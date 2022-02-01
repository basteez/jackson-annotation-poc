package com.basteez.jackson_annotation_poc.service;

import com.basteez.jackson_annotation_poc.pojo.Civilization;
import com.basteez.jackson_annotation_poc.pojo.CivilizationList;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RegisterRestClient(baseUri = "https://age-of-empires-2-api.herokuapp.com/api/v1")
@ApplicationScoped
public interface AgeOfEmpiresService {

    @GET
    @Path("/civilizations")
    public CivilizationList getCivilizations();

    @GET
    @Path("/civilization/{id}")
    public Civilization getSingleCivilization(@PathParam("id") Integer id);
}
