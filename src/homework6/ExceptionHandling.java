package homework6;

public class ExceptionHandling {

    public static void main(String[] args) {

        ExceptionHandling x = new ExceptionHandling();

        x.divideNumbers();
        x.accessArray();
        x.convertString();
        x.divideNumbersFinally();
    }

    public void divideNumbers() {
        System.out.println("\n1. try-catch");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Результат равен " + result);

        } catch (ArithmeticException e) {
            System.out.println("Произошла арифметическая ошибка!");
        }
        System.out.println("Программа продолжила работать\n");
    }

    public void accessArray() {
        System.out.println("2. multiple try-catch");

        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);

            String text = null;
            System.out.println(text.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс массива выходит за пределы допустимого диапазона!");

        } catch (NullPointerException e) {
            System.out.println("Переменная равна null!");
        }

        System.out.println("Программа продолжила работать\n");
    }

    public void convertString() {
        System.out.println("3. multi-catch");

        try {
            String input = "Hi";
            int numb = Integer.parseInt(input);
            System.out.println(numb);

            int[] arr = {1};
            System.out.println(arr[1]);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Это либо не число, либо неверный индекс массива!");
        }

        System.out.println("Программа продолжила работать\n");
    }

    public void divideNumbersFinally() {
        System.out.println("4. try-catch-finally");
        try {
            int a = 10 / 0;
            System.out.println("Результат: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Произошла арифметическая ошибка!");
        } finally {
            System.out.println("Блок finally выполняется всегда!");
        }
        System.out.println("Программа продолжила работать\n");
    }
}