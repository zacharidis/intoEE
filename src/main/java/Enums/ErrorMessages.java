package Enums;

public enum ErrorMessages {

    MISSING_REQUIRED_FIELD("Missing required field. Please check documentation"),
    RECORD_ALREADY_EXISTS("The record already exists");
    private String errorMessage ;


    ErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
