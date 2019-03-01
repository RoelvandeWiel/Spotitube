package nl.han.ica.oose.dea;

import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Path("/")

public class App {

    @GET
    public String hoi(){
        return "Hello World!";
    }

}
