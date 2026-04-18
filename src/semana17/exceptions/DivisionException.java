package semana17.exceptions;

public class DivisionException extends Exception {


    public DivisionException(String message) {
        super(message);
    }

    public DivisionException() {
        super("You cannot divide an odd number by an even number.");
    }
}
