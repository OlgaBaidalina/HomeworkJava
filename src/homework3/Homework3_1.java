package homework3;

import java.util.Scanner;

public class Homework3_1 {

 /*
 Размер массива задает пользователь с клавиатуры.
 Заполнение массива методом Math.random.
 1. Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.print("Прямой порядок: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.print("\nОбратный порядок: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}