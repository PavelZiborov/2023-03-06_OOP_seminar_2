package Figures.Figures;

public class Square extends Rectangle {

    private int lenght;

    public Square(int lenght) {
        super(lenght, lenght);
    }

    public Square(){
        this(2);
    }

    @Override
    public String toString() {
        return "Квадрат";
    }
}
