package Seminar02.Base;


public abstract class Polygon implements Figure, Perimeterable {
    protected int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
    }

    @Override
    public int PerimeterCalculation() {
        int sum = 0;
        for (int side : sides)
            sum += side;
        return sum;
    }

}
