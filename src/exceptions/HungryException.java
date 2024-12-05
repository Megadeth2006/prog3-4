package exceptions;

public class HungryException extends Exception {
    // Конструктор для создания исключения с сообщением
    public HungryException(String message) {
        super(message);
    }
}