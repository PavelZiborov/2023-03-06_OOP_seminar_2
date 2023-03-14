package Zoo.Base;

import Zoo.Base.Interfaces.AnimalInterface;

public abstract class Pet extends Animal implements AnimalInterface {
    private String name;
    private String breed;
    private Boolean vaccination;
    private String coatColor;
    private String birthDate;

    public Pet() {
        super();
    }


    public void showAffection() {
        System.out.println("Проявляю ласку");
    }


    public Pet(int height, int weight, String eyeColor, String name, String breed, Boolean vaccination, String coatColor, String birthDate) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.coatColor = coatColor;
        this.birthDate = birthDate;
    }

    @Override
    public StringBuilder info() {
        StringBuilder sb = new StringBuilder(String.format("type=%s; name=%s; breed=%s; vaccination=%b; coatColor=%s; birthDate=%s"
                ,type, name, breed, vaccination,coatColor,birthDate));
        return super.info().append(sb);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Boolean getVaccination() {
        return vaccination;
    }

    public void setVaccination(Boolean vaccination) {
        this.vaccination = vaccination;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
