package attractions;

public interface AttractionUsing {
    void start();    // Запуск аттракциона
    void stop();     // Остановка аттракциона
    boolean isAvailable();                     // Проверка доступности
}
