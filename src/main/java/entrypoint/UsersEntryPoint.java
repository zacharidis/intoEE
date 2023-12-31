package entrypoint;


import DTO.UserDTO;
import Service.UsersService;
import Service.impl.UsersServiceImpl;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.CreateUserRequestModel;
import model.UserProfileRest;
import org.springframework.beans.BeanUtils;

@Path("/users")
public class UsersEntryPoint {


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserProfileRest createUser(CreateUserRequestModel requestObject) {

        UserProfileRest returnValue = new UserProfileRest();

        // prepare DTO
        UserDTO userDto = new UserDTO();
        BeanUtils.copyProperties(requestObject ,userDto);

        //crete new user
        UsersService usersService = new UsersServiceImpl();
       UserDTO createdUserProfile =  usersService.createUser(userDto);

        // prepare response
        return returnValue;

    }




}
