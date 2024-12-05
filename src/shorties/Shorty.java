package shorties;
import exceptions.HungryException;

public class Shorty {
    private final String name;      // Имя коротышки
    private boolean isHungry; // Состояние голода (голоден ли)
    private boolean hasFood;  // Есть ли еда

    // Конструктор для создания коротышки с именем и состоянием голода и еды
    public Shorty(String name, boolean isHungry, boolean hasFood) {
        this.name = name;
        this.isHungry = isHungry;
        this.hasFood = hasFood;
    }

    // Метод для того, чтобы коротышка поел
    public void eat() throws HungryException {
        if (isHungry) {
            if (!hasFood) {
                // Если нет еды, выбрасываем исключение
                throw new HungryException(name + " голодный, но ему нечего поесть");
            }
            // Если еда есть, поедаем
            System.out.println(name + " ест.");
            isHungry = false; // Коротышка не голоден после еды
        } else {
            System.out.println(name + " не голодный.");
        }
    }

    // Метод для установки еды (например, покупка еды)
    public void setFood(boolean hasFood) {
        this.hasFood = hasFood;
    }

    // Метод для того, чтобы установить голод
    public void setHunger(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // Метод для вывода состояния коротышки
    @Override
    public String toString() {
        return name + " is " + (isHungry ? "голодный" : "не голодный") + " и " + (hasFood ? "имеет еду" : "не имеет еду.");
    }
}
