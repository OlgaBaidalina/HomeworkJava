package homework4;


/*
   Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
*/

public class CreditCard {

    private final String accountNumber;
    private double accountBalance;

    public CreditCard(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("3454 2424 6577 8788", 55000.0);
        CreditCard card2 = new CreditCard("1868 7868 3535 2607", 15000.0);
        CreditCard card3 = new CreditCard("5266 9843 6671 3305", 23000.0);

        System.out.println("Баланс кредитных карт:");
        card1.currentInfo();
        card2.currentInfo();
        card3.currentInfo();

        System.out.println("\nСовершенные операции по кредитным картам:");
        card1.accrual(30000.0);
        card2.accrual(4500.0);
        card3.withdraw(2000.0);

        System.out.println("\nБаланс кредитных карт:");
        card1.currentInfo();
        card2.currentInfo();
        card3.currentInfo();
    }

    public void accrual(double amount) {
        accountBalance = accountBalance + amount;
        System.out.println("На карту " + accountNumber + " начислено: " + amount + " рублей");
    }

    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance = accountBalance - amount;
            System.out.println("С карты " + accountNumber + " снято: " + amount + " рублей");
        } else {
            System.out.println("На карте" + accountNumber + " недостаточно средств");
        }
    }

    public void currentInfo() {
        System.out.println("Номер счета: " + accountNumber + ", Сумма: " + accountBalance + " рублей");
    }
}