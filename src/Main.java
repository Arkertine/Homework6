//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " ");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i + " ");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i + " ");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.printf("«%s год является високосным.»%n", i);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i + " ");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i + " ");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 8 and Task 9");
        double total = 0;
        double deposite = 29000;
        double percentPerMonth = 1.01;
        for (int i = 1; i <= 12; i++) {
            total += deposite;
            total *= percentPerMonth;
            System.out.printf("«Месяц %s, сумма накоплений равна %.2f рублей.»%n", i, total);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %s = %s%n", i, i * 2);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        }
}