package homework7;

/*
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
*/

import java.util.Scanner;

public class Homework7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите слово:");
        String s = scanner.nextLine();

        System.out.print("\nРезультат: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "" + s.charAt(i));
        }
    }
}