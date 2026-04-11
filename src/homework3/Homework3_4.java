package homework3;

import java.util.Scanner;

public class Homework3_4 {

 /*
 Размер массива задает пользователь с клавиатуры.
 Заполнение элементов массива вручную.
 4. Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
 вывести сообщение, что их нет.
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
        int zero = 0;

        for (int number : numbers) {
            if (number == 0) zero++;
        }
        if (zero != 0) {
            System.out.println("Количество нулевых элементов: " + zero);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }
}