package Zoo.View;

import Zoo.Base.Animals.*;
import Zoo.Base.Zoo;

import java.util.Scanner;

public class Menu extends Zoo{

    public void printMenu(Zoo zoo, Scanner scanner) {
        System.out.println("1. Добавить животное в зоопарк");
        System.out.println("2. Убрать животное из зоопарка");
        System.out.println("3. Распечатать инфо о животном введя его id");
        System.out.println("4. Распечатать инфо о всех животных в зоопарке");
        System.out.println("5. Издать звук животное введя его id");
        System.out.println("6. Издать звук всех животных в зоопарке");

        String answer = scanner.nextLine();
        if (answer.equals("1")){
            addAnimal(zoo);
            printMenu(zoo, scanner);
        } else if (answer.equals("2")) {
        }
    }

    public void addAnimal(Zoo zoo) {
        System.out.println("Какое животное добавляем?" +
                "\n1. Дикое животное" +
                "\n2. Домашнее животное" +
                "\n3. Птица");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                addWildAnimal();
                break;
            case 2:
                addPet();
                break;
            case 3:
                addBird();
                break;
        }
    }

    public void addWildAnimal(){

        System.out.println("Какое животное добавляем?" +
                "\n1. Тигр" +
                "\n2. Волк");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                Tiger tiger = new Tiger();
                addAnimalToArrayList(tiger);
                break;
            case 2:
                Wolf wolf = new Wolf();
                addAnimalToArrayList(wolf);
                break;
        }
    }

    public void addPet(){
        System.out.println("Какое животное добавляем?" +
                "\n1. Кошка" +
                "\n2. Собака");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                Cat cat = new Cat();
                addAnimalToArrayList(cat);
                break;
            case 2:
                Dog dog = new Dog();
                addAnimalToArrayList(dog);
                break;
        }
    }

    public void addBird(){
        System.out.println("Какое животное добавляем?" +
                "\n1. Гусь" +
                "\n2. Курица");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                Stork stork = new Stork();
                addAnimalToArrayList(stork);
                break;
            case 2:
                Chicken chicken = new Chicken();
                addAnimalToArrayList(chicken);
                break;
        }
    }
}