
public class IllegalMarkException extends Exception{
    public IllegalMarkException(String message) {
        super(message);
    }

    public IllegalMarkException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalMarkException(Throwable cause) {
        super(cause);
    }

    public IllegalMarkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
