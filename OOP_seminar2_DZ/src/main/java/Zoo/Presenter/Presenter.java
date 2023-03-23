package Zoo.Presenter;

import Zoo.Base.Zoo;
import Zoo.View.Menu;

import javax.swing.text.View;
import java.util.Scanner;

public class Presenter {
    Scanner scanner;

    public Presenter(Scanner scanner) {
        this.scanner = scanner;
    }

    Menu menu = new Menu();
    Zoo zoo = new Zoo();
    public void button(){
        menu.printMenu(zoo, scanner);
        scanner.close();
    }
}
