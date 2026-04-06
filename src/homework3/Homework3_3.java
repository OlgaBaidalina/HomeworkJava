package homework3;

import java.util.Scanner;

public class Homework3_3 {

 /*
 Размер массива задает пользователь с клавиатуры.
 Заполнение массива методом Math.random.
 3. Найти индексы минимального и максимального элементов и вывести в консоль.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int indexMin = 0;
        int indexMax = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[indexMin]) indexMin = i;
            if (numbers[i] > numbers[indexMax]) indexMax = i;
        }
        System.out.println("Индекс минимального элемента: " + indexMin);
        System.out.println("Индекс максимального элемента: " + indexMax);
    }
}