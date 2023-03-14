package Zoo.Base.Animals;

import Zoo.Base.Bird;

public class Stork extends Bird {
    public Stork(int height, int weight, String eyeColor, int flyingHeight) {
        super(height, weight, eyeColor, flyingHeight);
        super.type = "Stork";
    }

    @Override
    public String sound() {
        return "Тк-Тк-Тк...";
    }

    @Override
    public StringBuilder info() {
        return super.info().append(String.format("; sound=%s",sound()));
    }


}
