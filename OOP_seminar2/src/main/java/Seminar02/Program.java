package Seminar02;

import Seminar02.Base.*;
import Seminar02.Figures.*;

public class Program {
    public static void main(String[] args) {


        Triangle triangle = new Triangle(3, 3, 5);
        Square square = new Square(6);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2,5);

        Figure[] figures = new Figure[]{triangle, square, circle, rectangle};
        for (Figure figure : figures) {
            info(figure);
        }
    }
    public static void info(Figure figure){
        System.out.println(figure);
        System.out.printf("Площадь %.2f", figure.area());
        if (figure instanceof Perimeterable) {
            Perimeterable perimeterable = (Perimeterable) figure;
            System.out.printf(", периметр %d\n", perimeterable.PerimeterCalculation());
        }
        if (figure instanceof Lenghtable){  // является ли объект Кругом, тогда
            Lenghtable lenghtable = (Lenghtable) figure; // создаем переменную и приводим ее к кругу
            System.out.printf(", длина окружности: %.2f\n", lenghtable.lenght());
        }

    }

}


