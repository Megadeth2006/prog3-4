package shorties;

import enums.Mood;

public class OtherShorty extends Shorty {
    public OtherShorty(boolean isHungry, boolean lookedRestaurant, boolean inRestaurant, Mood mood, int id){
        super(isHungry, lookedRestaurant, inRestaurant, mood, id);
    }
    @Override
    public void walk(){
        System.out.println("Коротышка " + Integer.toString(id) +" гуляет с настроением: " + this.mood);
    }
    @Override
    public void dance(){
        if (this.mood == Mood.HAPPY){
            System.out.println("Также этот коротышка танцует");
        }
        else{
            this.mood = Mood.HAPPY;
            System.out.println("Также этот коротышка танцует и улучшает свое настроение до "+this.mood);
        }



    }

}
