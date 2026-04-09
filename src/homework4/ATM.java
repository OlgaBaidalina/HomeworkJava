package homework4;

/*
    Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
*/

public class ATM {
    int count20;
    int count50;
    int count100;

    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public static void main(String[] args) {
        ATM atm = new ATM(5, 3, 2);
        atm.showBalance();
        System.out.println(" Попытка снятия 270 рублей");
        boolean success = atm.withdrawalMoney(270);
        System.out.println(" Успешность выполнения операции: " + success + "\n");
        atm.showBalance();
        System.out.println(" Попытка снятия 200 рублей");
        success = atm.withdrawalMoney(200);
        System.out.println(" Успешность выполнения операции: " + success);
    }

    public void addingMoney(int add20, int add50, int add100) {
        count20 = count20 + add20;
        count50 = count50 + add50;
        count100 = count100 + add100;
        int total = count20 * 20 + count50 * 50 + count100 * 100;
        System.out.println(" В банкомате: " + total + " рублей");
    }

    public boolean withdrawalMoney(int amount) {
        int give100 = 0;
        int give50 = 0;
        int give20 = 0;

        while (amount >= 100 && count100 > 0) {
            amount = amount - 100;
            give100++;
            count100--;
        }
        while (amount >= 50 && count50 > 0) {
            amount = amount - 50;
            give50++;
            count50--;
        }
        while (amount >= 20 && count20 > 0) {
            amount = amount - 20;
            give20++;
            count20--;
        }
        if (amount != 0) {
            System.out.println(" Нет нужной суммы!");
            return false;
        }
        System.out.println(" Выдано:\n 100 рублей - " + give100 + " шт,\n" + " 50 рублей - " + give50 + " шт,\n" + " 20 рублей - " + give20 + " шт\n");
        return true;
    }

    public void showBalance() {
        int total = count20 * 20 + count50 * 50 + count100 * 100;
        System.out.println(" В банкомате: " + total + " рублей");
    }
}