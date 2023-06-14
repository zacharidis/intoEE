package entrypoint;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UsersEntryPoint {


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public CreateUserResponseModel createUser(CreateUserRequestModel requestModel) {

        CreateUserResponseModel returnValue = new CreateUserResponseModel();
        return returnValue;

    }




}