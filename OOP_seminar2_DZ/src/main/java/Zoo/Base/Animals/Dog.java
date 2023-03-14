package Zoo.Base.Animals;

import Zoo.Base.Pet;

public class Dog extends Pet {
    private Boolean training;

    public Dog(int height, int weight, String eyeColor, String name, String breed, Boolean vaccination, String coatColor, String birthDate, Boolean training) {
        super(height, weight, eyeColor, name, breed, vaccination, coatColor, birthDate);
        this.training = training;
        super.type = "Dog";
    }

    public Boolean getTraining() {
        return training;
    }

    public void Train(){
        System.out.println("Надрессирован");
        training = true;
    }

    @Override
    public String sound() {
        return "Гав...";
    }

    @Override
    public StringBuilder info() {
        return super.info().append(String.format("; training=%b; sound=%s",training, sound()));
    }
}
