package Zoo.Base.Animals;

import Zoo.Base.Bird;

public class Chicken extends Bird {

    public Chicken(int height, int weight, String eyeColor, int flyingHeight) {
        super(height, weight, eyeColor, flyingHeight);
        super.type = "Chiken";
    }

    public Chicken() {
        super();
    }

    @Override
    public String sound() {
        return "Ко-Ко-Ко...";
    }

    @Override
    public StringBuilder info() {
        return super.info().append(String.format("; sound=%s",sound()));
    }
}
