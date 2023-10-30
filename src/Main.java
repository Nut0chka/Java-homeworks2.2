public class Main {
    public static void main(String[] args) {
        int score = 100;
        int depositAccount = 1100;

        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 100;
        } else {
            bonus = 0;
        }

        int balance = score + depositAccount + bonus;
        System.out.println("Ваша итоговая сумма на счете: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}