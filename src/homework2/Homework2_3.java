package homework2;

public class Homework2_3 {

/*
Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.
*/

    public static void main(String[] args) {
        System.out.println("Квадраты чисел от 10 до 20:");
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println(i + "² = " + square);
        }
    }
}