package homework7;

/*
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
*/

import java.util.Scanner;

public class Homework7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите 3 строки через Enter:");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        String[] words = (s1 + " " + s2 + " " + s3).split(" ");

        for (String w : words) {
            boolean unique = true;
            for (int i = 0; i < w.length() && unique; i++) {
                for (int j = i + 1; j < w.length(); j++) {
                    if (w.charAt(i) == w.charAt(j)) {
                        unique = false;
                        break;
                    }
                }
            }
            if (unique) {
                System.out.println("\nСлово, состоящее только из различных символов:\n" + w);
                scanner.close();
                return;
            }
        }

        System.out.println("\nСлов, состоящих только из различных символов, не найдено.");
        scanner.close();
    }
}