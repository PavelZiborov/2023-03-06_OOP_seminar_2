package Zoo;

import Zoo.Base.Animal;
import Zoo.Base.Animals.*;
import Zoo.Presenter.Presenter;
import Zoo.View.Menu;
import Zoo.Base.Zoo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Presenter presenter = new Presenter(scanner);
        presenter.button();


//        Animal cat = new Cat(1,5,"голубые","Барсик", "Сиамский", true, "Серый", "2022-01-23", true);
//        Animal tiger = new Tiger(1,140, "зеленые", "Африка", "2019");
//        Animal dog = new Dog(1,6,"Карие","Микки", "Тойтерьер", true, "коричневый", "2017", false);
//        Animal wolf = new Wolf(1, 80, "Голубые","Сибирь","2020", true);
//        Animal chicken = new Chicken(0, 9,"карие", 1);
//        Animal stork = new Stork(1,25,"Карие", 200);
//
//        Zoo zoo = new Zoo();
//
//        zoo.addAnimalToArrayList(tiger);
//        zoo.addAnimalToArrayList(cat);
//        zoo.addAnimalToArrayList(chicken);
//        zoo.addAnimalToArrayList(dog);
//        zoo.addAnimalToArrayList(wolf);
//
//        zoo.printAnimalsFromArrayList();
//
//
//        System.out.println("--------------------------");
//
//        zoo.deleteAnimalFromArrayList(2);
//        zoo.printAnimalsFromArrayList();
//
//        zoo.makeSoundFromArrayList(2);
//        zoo.getInfoFromArrayList(3);
//        zoo.makeSoundAllFromArrayList();
//
//        Menu menu = new Menu();
//        menu.printMenu(zoo);
//        System.out.println("End");
//        zoo.printAnimalsFromArrayList();


    }
}

// 1) Реализовать view, presenter, Model.
// 2) Раскидать класс Zoo.
// 3) Класс Menu перекинуть во view
// 4) Убрать все sb во view
// 5) Обработка исключений