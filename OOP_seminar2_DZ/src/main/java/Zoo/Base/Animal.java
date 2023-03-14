package Zoo.Base;

import Zoo.Base.Interfaces.AnimalInterface;

public abstract class Animal implements AnimalInterface {
    private int height;
    private int weight;
    private String eyeColor;
    protected String type;
    protected int id;

    protected Animal(int height, int weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public Animal() {

    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getType() {
        return type;
    }

    @Override
    public StringBuilder info() {
        StringBuilder sb = new StringBuilder(String.format("id=%d; height=%d; weight=%d; eyeColor=%s; ",
                id, height, weight, eyeColor));
        return sb;
    }
}
