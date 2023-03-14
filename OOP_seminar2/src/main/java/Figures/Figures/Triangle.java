package Figures.Figures;

import Figures.Base.Polygon;

public class Triangle extends Polygon {

    public Triangle(int a, int b, int c){
        super(new int[]{a,b,c});
    }

    @Override
    public double area() {
        double p = PerimeterCalculation()/2.0;
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }

    @Override
    public String toString() {
        return "Треугольник";
    }


}
