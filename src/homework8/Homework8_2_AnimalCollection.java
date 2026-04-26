package homework8;

import java.util.LinkedList;

public class Homework8_2_AnimalCollection {

    private final LinkedList<String> animals;

    public Homework8_2_AnimalCollection() {
        animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
        System.out.println("\nДобавлен " + animal);
    }

    public String removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста!");
            return null;
        }
        String removed = animals.removeLast();
        System.out.println("\nУдален " + removed);
        return removed;
    }

    public void showAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста!");
        } else {
            System.out.println("Коллекция животных: " + animals);
        }
    }

}