package homework1;

public class Homework1_6 {

    public static void main(String[] args) {
        int a = 33;
        int b = 44;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Результат после замены: a = " + a + ", b = " + b);
    }
}
