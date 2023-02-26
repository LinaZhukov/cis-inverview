package com.example.demo;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/animals")
public class AnimalResource {
    @GET
    public Animal[] getAnimals(){
        Animal[] animals = new Animal[3];
        return animals;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String createAnimal(Animal animal) {
        return "Animal Created";
    }
}
