package attractions;
import exceptions.AttractionException;

public interface Playable {
    void start() throws AttractionException;    // Запуск аттракциона
    void stop() throws AttractionException;     // Остановка аттракциона
    boolean isAvailable();                     // Проверка доступности
}
