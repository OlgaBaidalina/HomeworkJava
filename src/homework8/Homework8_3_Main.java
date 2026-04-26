package homework8;

/*
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз.Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
*/

public class Homework8_3_Main {
    public static void main(String[] args) {

        String[] array = {"guitar", "piano", "flute", "guitar", "piano", "drums", "bongo", "flute", "conga", "tuba", "guitar"};
        System.out.println("\nВывод: \n" + Homework8_3_Collection. wordMultiple(array));
    }
}