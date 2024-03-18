class main {
    public static void main(String[] args) {

        int initialBalance = 1300;
        int addend = 500;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый счет:" + finalBalance);
        System.out.println("Бонус:" + bonus);

    }
}
