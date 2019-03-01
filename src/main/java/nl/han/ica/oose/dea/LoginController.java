package nl.han.ica.oose.dea;

import nl.han.ica.oose.dea.dto.LoginRequestDto;
import nl.han.ica.oose.dea.dto.LoginResponseDto;

import javax.ws.rs.POST;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/login")

public class LoginController {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response login(LoginRequestDto request){

        if("Piet".equals(request.getUser())){
            Response.status(401).build();
        }

        String token = "hashedtoken";
        String user = "Roel";

        LoginResponseDto response = new LoginResponseDto();
        response.setToken(token);
        response.setUser(user);


        return Response.ok().entity(response).build();
    }

}
