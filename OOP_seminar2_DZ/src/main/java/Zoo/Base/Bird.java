package Zoo.Base;

import Zoo.Base.Interfaces.AnimalInterface;

public abstract class Bird extends Animal implements AnimalInterface {
    protected int flyingHeight;

    public Bird() {

    }

    public void fly() {
        System.out.println(String.format("Я лечу на %d метрах", flyingHeight));
    }

    protected Bird(int height, int weight, String eyeColor, int flyingHeight) {
        super(height, weight, eyeColor);
        this.flyingHeight = flyingHeight;
    }

    @Override
    public StringBuilder info() {
        StringBuilder sb = new StringBuilder(String.format("type=%s; flyingHeight=%d"
                ,type, flyingHeight));
        return super.info().append(sb);
    }
}
