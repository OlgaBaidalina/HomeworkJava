package homework8;

/*
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
*/

public class Homework8_2_Main {
    public static void main(String[] args) {

        Homework8_2_AnimalCollection zoo = new Homework8_2_AnimalCollection();

        zoo.addAnimal("Барсук");
        zoo.showAllAnimals();

        zoo.addAnimal("Жираф");
        zoo.showAllAnimals();

        zoo.removeAnimal();
        zoo.showAllAnimals();

        zoo.addAnimal("Кенгуру");
        zoo.showAllAnimals();

        zoo.addAnimal("Слон");
        zoo.showAllAnimals();

        zoo.removeAnimal();
        zoo.showAllAnimals();

        zoo.addAnimal("Тушканчик");
        zoo.showAllAnimals();

        zoo.removeAnimal();
        zoo.showAllAnimals();

        zoo.removeAnimal();
        zoo.showAllAnimals();

        zoo.removeAnimal();
        zoo.showAllAnimals();

        System.out.println("\nПопытка удаления из пустой коллекции");
        zoo.removeAnimal();
    }
}