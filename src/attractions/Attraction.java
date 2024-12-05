package attractions;

import exceptions.AttractionException;
import enums.AttractionStatus;
public abstract class Attraction {
    private String name;
    private AttractionStatus status;  // Используем enum для состояния аттракциона

    public Attraction(String name, AttractionStatus status) {
        this.name = name;
        this.status = status;
    }

    public abstract void start() throws AttractionException;

    public String getName() {
        return name;
    }

    public AttractionStatus getStatus() {
        return status;
    }

    public void setStatus(AttractionStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name + " is " + status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Attraction that = (Attraction) obj;
        return name.equals(that.name) && status == that.status;
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + status.hashCode();
    }
}