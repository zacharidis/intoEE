package Exception;

public class MissingRequiredFieldException extends RuntimeException {

    private static final long serialVersionID = 5423525523523532523L;

    public  MissingRequiredFieldException(String message)
    {

        super(message);
    }

}
