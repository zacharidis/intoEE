package utils;

import DTO.UserDTO;
import org.springframework.core.env.MissingRequiredPropertiesException;

public class UserProfileUtils {


    public void validateRequiredFields(UserDTO userDTO) throws MissingRequiredPropertiesException {

        if (userDTO.getFirstName()==null ||
                userDTO.getFirstName().isEmpty() ||
            userDTO.getLastName() == null ||
            userDTO.getLastName().isEmpty()  ||
            userDTO.getEmail() ==null ||  userDTO.getEmail().isEmpty()) {
           // throw  new MissingRequiredFieldException(ErrorMessage.MISSING_REQUIRED_FIELD.getErrorMessage());
        }
    }






}
