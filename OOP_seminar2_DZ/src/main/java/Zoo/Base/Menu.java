package Zoo.Base;

import Zoo.Base.Animals.Cat;

import java.util.Objects;
import java.util.Scanner;

public class Menu extends Zoo {
    public void printMenu(Zoo zoo) {
        System.out.println("1. Добавить животное в зоопарк");
        System.out.println("2. Убрать животное из зоопарка");
        System.out.println("3. Распечатать инфо о животном введя его id");
        System.out.println("4. Распечатать инфо о всех животных в зоопарке");
        System.out.println("5. Издать звук животное введя его id");
        System.out.println("6. Издать звук всех животных в зоопарке");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("1")){
            addAnimal(zoo);
        }
    }

    public void addAnimal(Zoo zoo) {
        System.out.println("Какое животное добавляем?" +
                "\n1. Кошка" +
                "\n2. Собака" +
                "\n3. Курица" +
                "\n4. Лебедь" +
                "\n5. Тигр" +
                "\n6. Волк");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (Objects.equals(answer, "1")) {
            Cat cat = new Cat();
            cat.type = "Cat";

            System.out.println("Высота животного: ");
            cat.setHeight(Integer.parseInt(scanner.nextLine()));

            System.out.println("Вес животного: ");
            cat.setWeight(Integer.parseInt(scanner.nextLine()));

            System.out.println("Цвет глаз: ");
            cat.setEyeColor(scanner.nextLine());

            System.out.println("Имя: ");
            cat.setName(scanner.nextLine());

            System.out.println("Порода: ");
            cat.setBreed(scanner.nextLine());

            System.out.println("Вакцинация (1 - да, 2 - нет): ");
            String vaccination = scanner.nextLine();
            if (vaccination.equals("1")){
                cat.setVaccination(true);
            } else if (vaccination.equals("0")){
                cat.setVaccination(false);
            }

            System.out.println("Цвет шерсти: ");
            cat.setCoatColor(scanner.nextLine());

            System.out.println("Дата рождения: ");
            cat.setBirthDate(scanner.nextLine());

            System.out.println("Присутствие шерсти (1 - да, 2 - нет): ");
            String WoolPresence = scanner.nextLine();
            if (WoolPresence.equals("1")){
                cat.setWoolPresence(true);
            } else if (WoolPresence.equals("0")){
                cat.setWoolPresence(false);
            }
            zoo.addAnimalToArrayList(cat);
        }
    }
}
