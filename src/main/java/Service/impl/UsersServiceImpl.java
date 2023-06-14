package Service.impl;

import DTO.UserDTO;
import Service.UsersService;
import utils.UserProfileUtils;

public class UsersServiceImpl implements UsersService {

    UserProfileUtils userProfileUtils = new UserProfileUtils();
    public UserDTO createUser(UserDTO user) {
        UserDTO returnValue = new UserDTO();


        //add the validations here
         userProfileUtils.validateRequiredFields(user);
        // check if the user exists

        // create entity object

        // generate secure public id

        // generate salt

        // generate secure password

        // record the object into the database

        // return the value back (profile)






        return returnValue;
    }
}
