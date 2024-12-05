package exceptions;

public class AttractionException extends Exception {
    public AttractionException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Аттракцион недоступен по причине: " + super.getMessage();
    }
}
