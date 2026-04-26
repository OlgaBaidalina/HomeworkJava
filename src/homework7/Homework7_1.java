package homework7;

/*
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
*/

import java.util.Scanner;

public class Homework7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Введите 3 строки через Enter:");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        String min = s1;
        String max = s1;

        if (s2.length() < min.length()) min = s2;
        if (s3.length() < min.length()) min = s3;
        if (s2.length() > max.length()) max = s2;
        if (s3.length() > max.length()) max = s3;

        System.out.println("\n Самая короткая строка: " + min + ".\n Ее длина составляет: " + min.length() + " символов\n");
        System.out.println(" Самая длинная строка: " + max + ".\n Ее длина составляет: " + max.length() + " символов");
        scanner.close();
    }
}