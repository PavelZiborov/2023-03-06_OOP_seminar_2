package Zoo.Base;

import Zoo.Base.Animals.Cat;
import java.util.*;


public class Zoo {

    // массив
    protected ArrayList<Animal> animalArrayList = new ArrayList<>();
    private int sizeArrayList = 0;
    public void addAnimalToArrayList(Animal animal){ // вставляет в конец списка
        this.animalArrayList.add(animal);
        this.sizeArrayList += 1;
        animal.id = this.sizeArrayList;
    }
    public void addAnimalToArrayList(Animal animal, int position){ // вставляет на указанный индекс сдвигая остальное вправо
        if (position >= 0 & position <= animalArrayList.size()){
            this.animalArrayList.add(position, animal);
            this.sizeArrayList += 1;
            animal.id = position + 1;
            for (int i = position + 1; i < animalArrayList.size(); i++){
                this.animalArrayList.get(i).id = i + 1;
            }

        }
        else {
            System.out.println("Вы пытались вставить на несуществующий индекс. Вставлено в конец списка");
            addAnimalToArrayList(animal);
        }
    }
    public void deleteAnimalFromArrayList(int id){
        if (id > 0 & id <= animalArrayList.size()){
            animalArrayList.get(id-1).id = 0;
            animalArrayList.remove(id-1);
            sizeArrayList -= 1;
            for (int i = id-1; i < animalArrayList.size(); i++){
                this.animalArrayList.get(i).id = i + 1;
            }
        } else {System.out.println("введен не существующий id животного");}
    }
    public void getInfoFromArrayList(int id){
        if (id > 0 & id <= animalArrayList.size()){
            System.out.println(animalArrayList.get(id-1).info());
        } else {System.out.println("введен не существующий id животного");}
    }
    public void makeSoundFromArrayList(int id){
        if (id > 0 & id <= animalArrayList.size()){
            System.out.println(animalArrayList.get(id-1).sound());
        } else {System.out.println("введен не существующий id животного");}
    }
    public void makeSoundAllFromArrayList() {
        for (Animal animal : animalArrayList){
            System.out.println(animal.sound());
        }
    }

    public int getSizeArrayList() {
        return sizeArrayList;
    }





//    3.Посмотреть информацию о животном с номером i





    // стек
    private Stack<Animal> animalStack = new Stack<>();
    public void addAnimalToStack (Animal animal){
        this.animalStack.push(animal);
    }
    public void deleteAnimalFromStack(Animal animal){
        animalStack.pop();
    }

    // очередь
    private Deque<Animal> deque = new LinkedList<>();
    public void addAnimalToDeque (Animal animal){
        this.deque.add(animal);
    }
    public void deleteAnimalFromDeque(){
        this.deque.remove();
    }


    public void printAnimalsFromArrayList(){
        for (Animal animal: this.animalArrayList)
            System.out.println(animal.info());
    }

}

