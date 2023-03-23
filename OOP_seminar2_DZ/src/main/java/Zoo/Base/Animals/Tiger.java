package Zoo.Base.Animals;

import Zoo.Base.WildAnimal;

public class Tiger extends WildAnimal {

    public Tiger(int height, int weight, String eyeColor, String habitat, String locationDate) {
        super(height, weight, eyeColor, habitat, locationDate);
        super.type = "Tiger";
    }

    public Tiger() {
        super();
    }

    @Override
    public String sound() {
        return "Арр...";
    }

    @Override
    public StringBuilder info() {
        return super.info().append(String.format("; sound=%s", sound()));
    }
}
