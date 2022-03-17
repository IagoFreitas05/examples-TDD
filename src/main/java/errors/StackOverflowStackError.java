package errors;

public class StackOverflowStackError extends RuntimeException {
    public StackOverflowStackError(String message){
        super(message);
    }
}
