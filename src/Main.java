public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int addend = 1100;

        int bonus;
        if (addend > 1000) {
            bonus = addend / 100;
        } else {
            bonus = 0;
        }
        int FinalAmount = initialBalance +addend+ bonus;

        System.out.println("Итоговый счёт:" + FinalAmount);
        System.out.println("Количество бонусных рублей:" + bonus);
    }
}
