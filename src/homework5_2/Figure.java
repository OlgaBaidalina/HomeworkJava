package homework5_2;

/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
*/

public abstract class Figure {

    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(9, 4, 7),
                new Rectangle(7.5, 10.1),
                new Circle(7.7), // - радиус круга
                new Triangle(6, 8.3, 10),
                new Rectangle(4, 6.2)
        };

        double totalPerimeter = 0;

        for (int i = 0; i < figures.length; i++) {
            Figure figure = figures[i];
            totalPerimeter = totalPerimeter + figures[i].calculatePerimeter();
        }
        System.out.printf("\nСумма периметра всех фигур: " + totalPerimeter + "\n");
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();
}