package Seminar02.Figures;

import Seminar02.Base.Figure;
import Seminar02.Base.Lenghtable;

public class Circle implements Figure, Lenghtable {

    private double d;

    public Circle(double d){
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Круг";
    }

    @Override
    public double area() {
        return 0.25*Math.PI*d;
    }

    @Override
    public double lenght() {
        return d*Math.PI;
    }
}
