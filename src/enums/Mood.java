package enums;

public enum Mood {
    HAPPY("Счастливый"),
    ENVY("Завистливый"),
    SAD("Грустный");
    private final String name;
    Mood(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
}
