package Zoo.Base;

import Zoo.Base.Interfaces.AnimalInterface;

public abstract class WildAnimal extends Animal implements AnimalInterface {
    private String habitat;
    private String locationDate;


    public WildAnimal(int height, int weight, String eyeColor, String habitat, String locationDate) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.locationDate = locationDate;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getLocationDate() {
        return locationDate;
    }

    public void setLocationDate(String locationDate) {
        this.locationDate = locationDate;
    }

    @Override
    public StringBuilder info() {
        StringBuilder sb = new StringBuilder(String.format("type=%s; habitat=%s; locationDate=%s"
                ,type, habitat, locationDate));
        return super.info().append(sb);
    }
}
