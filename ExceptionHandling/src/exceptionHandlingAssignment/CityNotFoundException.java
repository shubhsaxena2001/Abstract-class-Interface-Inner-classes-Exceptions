package exceptionHandlingAssignment;

public class CityNotFoundException extends Exception {
    public CityNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
