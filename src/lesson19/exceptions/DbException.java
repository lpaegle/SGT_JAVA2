package lesson19.exceptions;

public class DbException extends Exception{

    // Usually two Constructors:
    //without parameters only super
    public DbException() {
        super();
    }
    //only with message parameter
    public DbException(String message) {
        super(message);
    }
}
