package homework3;

import java.util.Scanner;

public class Homework3_6 {

 /*
 Размер массива задает пользователь с клавиатуры.
 Заполнение массива методом Math.random.
 6. Проверить, является ли массив возрастающей последовательностью (каждое
 следующее число больше предыдущего).
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

        boolean creasing = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) {
                creasing = false;
                break;
            }
        }
        if (creasing) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ является возрастающей последовательностью");
        }
    }
}