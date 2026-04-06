package homework3;

import java.util.Scanner;

public class Homework3_2 {

 /*
 Размер массива задает пользователь с клавиатуры.
 Заполнение элементов массива вручную.
 2. Найти минимальный - максимальный элементы и вывести в консоль.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Элемент " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}