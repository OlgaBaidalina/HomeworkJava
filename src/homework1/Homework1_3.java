package homework1;

public class Homework1_3 {

    public static void main(String[] args) {
        int n = 564;
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % 100 % 10;
        System.out.println("Cумма цифр n = " + (a + b + c));
    }
}