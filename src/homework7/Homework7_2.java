package homework7;

/*
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
*/

import java.util.Scanner;

public class Homework7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите 3 строки через Enter:");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        if (s1.length() > s2.length()) { String t = s1; s1 = s2; s2 = t; }
        if (s2.length() > s3.length()) { String t = s2; s2 = s3; s3 = t; }
        if (s1.length() > s2.length()) { String t = s1; s1 = s2; s2 = t; }

        System.out.println("\nРасположение строк в порядке возрастания значений их длины:" );
        System.out.println("1. " + s1);
        System.out.println("2. " + s2);
        System.out.println("3. " + s3);
    }
}