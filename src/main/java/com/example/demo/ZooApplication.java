package com.example.demo;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class ZooApplication extends Application {
    @GET
    public String hello(){
        return "Zoo application running";
    }

}
