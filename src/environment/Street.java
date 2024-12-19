package environment;
import attractions.Attraction;
import enums.Mood;
import enums.StreetState;
import shorties.Shorty;

import java.util.ArrayList;

public class Street {
    protected String name;

    protected StreetState state;
    protected boolean hasLights;
    protected ArrayList<Shorty> shorties = new ArrayList<>();
    protected ArrayList<AD> adList = new ArrayList<>();

    public Street(String name){
        this.name = name;
    }

    public void addShorties(Shorty shorty){
        this.shorties.add(shorty);
    }
    public ArrayList<Shorty> getShorties(){
        return this.shorties;
    }
    public void addAD(AD ad){
        this.adList.add(ad);
    }
    public ArrayList<AD> getAD(){
        return this.adList;
    }
    public void removeAD(AD ad){
        this.adList.remove(ad);
    }
    public void setAD(ArrayList<AD> adList){
        this.adList = adList;
    }
    public void setState(StreetState state){
        this.state = state;
    }

    public String getName(){return this.name;}

    public StreetState getState(){
        return this.state;
    }

}
