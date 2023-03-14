package Zoo.Base.Animals;

import Zoo.Base.Pet;

public class Cat extends Pet {

    private Boolean woolPresence;


    public Cat(int height, int weight, String eyeColor, String name, String breed, Boolean vaccination, String coatColor, String birthDate, Boolean woolPresence) {
        super(height, weight, eyeColor, name, breed, vaccination, coatColor, birthDate);
        this.woolPresence = woolPresence;
        super.type = "Cat";
    }

    public Cat() {

    }

    public void setWoolPresence(Boolean woolPresence) {
        this.woolPresence = woolPresence;
    }

    public Boolean getWoolPresence() {
        return woolPresence;
    }

    @Override
    public String sound() {
        return "Мяу...";
    }

    @Override
    public StringBuilder info() {
        return super.info().append(String.format("; woolPresence=%b; sound=%s", woolPresence, sound()));
    }
}
