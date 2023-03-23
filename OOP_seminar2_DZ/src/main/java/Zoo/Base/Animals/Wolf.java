package Zoo.Base.Animals;

import Zoo.Base.WildAnimal;

public class Wolf extends WildAnimal {
    private Boolean leader;

    public Wolf(int height, int weight, String eyeColor, String habitat, String locationDate, Boolean leader) {
        super(height, weight, eyeColor, habitat, locationDate);
        this.leader = leader;
        super.type = "Wolf";
    }

    public Wolf() {

    }

    public Boolean getLeader() {
        return leader;
    }

    public void setLeader(Boolean leader) {
        this.leader = leader;
    }

    @Override
    public String sound() {
        return "Рррр...";
    }

    @Override
    public StringBuilder info() {
        return super.info().append(String.format("; leader=%b; sound=%s", leader, sound()));
    }
}
