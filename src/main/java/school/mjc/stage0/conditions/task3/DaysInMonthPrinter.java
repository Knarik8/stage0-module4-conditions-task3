package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public static void amountOfDays(int month) {
        if (month >= 1 && month <= 12) {
            if (month == 2) {
                System.out.println(29 + " or " + 28);
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(30);
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println(31);
            }
        } else {
            System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        amountOfDays(14);
    }
}
//
//31: 1 3 5 7 8 10 12
//30: 4 6 9 11
//28: 2