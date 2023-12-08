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
        int finalBalance = initialBalance + addend + bonus;

        System.out.println("Итоговый счёт:" + finalBalance);
        System.out.println("Количество бонусных рублей:" + bonus);
    }
}
