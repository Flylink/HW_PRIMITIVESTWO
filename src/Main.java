public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int replenishmentAmount = 2000;
        int bonus = 0;

        if (replenishmentAmount > 1000) {
            bonus = (replenishmentAmount / 100);
        }

        int totalBalance = currentBalance + replenishmentAmount + bonus;

        System.out.println("Итоговый счет: " + totalBalance + " руб.");
        System.out.println("Бонусные рубли: " + bonus + " руб.");
    }
}