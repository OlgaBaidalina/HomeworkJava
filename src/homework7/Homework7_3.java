package homework7;

/*
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
*/

import java.util.Scanner;

public class Homework7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите 3 строки через Enter:");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        double avg = (s1.length() + s2.length() + s3.length()) / 3.0;

        System.out.println ("\nСтрока(и), длина которых меньше средней:");

        if (s1.length() < avg) System.out.println(s1 + ", длина: " + s1.length());
        if (s2.length() < avg) System.out.println(s2 + ", длина: " + s2.length());
        if (s3.length() < avg) System.out.println(s3 +  ", длина: "  + s3.length());

        if (s1.length() >= avg && s2.length() >= avg && s3.length() >= avg) {
            System.out.println("Таких строк нет");
        }
        scanner.close();
    }
}