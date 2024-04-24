public class Main {


    public static void main(String[] args) {
        int amount = 990; // Пополняемая сумма
        int summa = 200; // Баланс счёта
        int bonus = amount / 100; // Начисляемые бонусы

        if (amount < 1000) {
            bonus = 0;
        }
        int balance = amount + summa + bonus;
        System.out.println("Ваш баланс телефона:" + balance);

    }
}