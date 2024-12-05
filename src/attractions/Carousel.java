package attractions;

import exceptions.AttractionException;

public class Carousel extends Attraction {

    public Carousel(String name, boolean isOperational) {
        super(name, isOperational); // Конструктор родительского класса
    }

    // Реализация метода start()
    @Override
    public void start() throws AttractionException {
        if (!isOperational) {
            // Если аттракцион не работает, выбрасываем исключение
            throw new AttractionException(name + " is not operational.");
        }
        System.out.println(name + " is now running!");
    }

    // Реализация метода stop()
    @Override
    public void stop() throws AttractionException {
        if (!isOperational) {
            // Если аттракцион не работает, выбрасываем исключение
            throw new AttractionException(name + " is not operational.");
        }
        System.out.println(name + " has stopped.");
    }
}
