package homework3;

import java.util.Scanner;

public class Homework3_5 {

 /*
 Размер массива задает пользователь с клавиатуры.
 Заполнение массива методом Math.random.
 5. Пройти по массиву и поменять местами элементы первый и последний, второй
 и предпоследний и т.д.
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

        for (int i = 0; i < numbers.length / 2; i++) {
        int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
    }
        System.out.println("Массив после изменения:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}