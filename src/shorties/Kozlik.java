package shorties;

import enums.Mood;
import exceptions.HungryException;

public class Kozlik extends Shorty{
    public Kozlik(boolean isHungry, boolean lookedRestaurant, boolean inRestaurant, Mood mood, int id){
        super(isHungry, lookedRestaurant, inRestaurant, mood, id);
        this.name = "Козлик";
    }
    public boolean getLookedRestaurant(){
        return this.lookedRestaurant;
    }
    @Override
    public void walk() throws HungryException {
        if (this.isHungry && this.lookedRestaurant && this.mood == Mood.SAD) throw new HungryException("Козлик хочет есть, посмотрел на ресторан и у него настроение: " + this.mood);
        System.out.println(this.name + " гуляет с настроением: " + this.mood);
    }
    @Override
    public void dance(){
        if (this.mood == Mood.HAPPY){
            System.out.println(this.name + " танцует");
        }else{
            this.mood = Mood.HAPPY;
            System.out.println(this.name + " танцует и улучшает свое настроение до " + this.mood);
        }

    }
    @Override
    public void lookAtTheRestaurant(){
        this.lookedRestaurant = true;
        System.out.println(this.name + " посмотрел на ресторан. Вот досада!");
    }
}
