package homework8;

/*
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
*/

import java.util.*;

public class Homework8_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите набор чисел через пробел:");
        String input = scanner.nextLine();

        String[] numbersArray = input.split(" ");
        Set<String> uniqueSet = new LinkedHashSet<>();

        for (String num : numbersArray) {
            String trimmed = num.trim();
            uniqueSet.add(trimmed);
        }
        System.out.println("Список уникальных неповторяющихся чисел: " + uniqueSet);

        scanner.close();
    }
}