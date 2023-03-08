package Seminar02.Figures;

import Seminar02.Base.*;

public class Rectangle extends Polygon implements Perimeterable {

    public Rectangle(int a, int b) {
        super(new int[]{a,b,a,b});
    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }

    @Override
    public String toString() {
        return "Прямоугольник";
    }


}
