public class Main {
    public static void main(String[] args) {
        float balance = 100.0f; // текущий баланс абонента
        float refill = 1001.30f;  // сумма пополнения баланса
        int bonus = (int) (refill / 100); // бонус пополнения
        if (refill > 1000) {
            balance = balance + refill + bonus;
        } else balance = balance + refill;
        System.out.println("Balance: " + balance);
    }
}
