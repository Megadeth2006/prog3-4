package attractions;

import enums.AttractionStatus;

public abstract class Attraction implements AttractionUsing {
    protected String name;
    protected AttractionStatus status;


    public Attraction(AttractionStatus status){

        this.status = status;
    }
    public AttractionStatus getStatus(){
        return this.status;
    }


    abstract public void start();
    public void stop(){

        this.status = AttractionStatus.NOT_RUNNING;

    }

    @Override
    public boolean isAvailable() {
        if (this.status == AttractionStatus.OPERATIONAL || this.status == AttractionStatus.UNDER_REPAIR){
            return false;
        }
        else return true;
    }

    @Override
    public String toString(){return "{name: " + this.name + "}";}
}