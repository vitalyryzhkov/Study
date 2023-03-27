package Initial_tasks;

import java.util.Scanner;

public class MonthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String monthIn = scanner.nextLine().toLowerCase();
        switch (monthIn) {
            case "декабрь", "январь", "февраль" -> System.out.println("Это зимний месяц");
            case "март", "апрель", "май" -> System.out.println("Это весенний месяц");
            case "июнь", "июль", "август" -> System.out.println("Это летний месяц");
            case "сентябрь", "октябрь", "ноябрь" -> System.out.println("Это осенний месяц");
            default -> System.out.println("Месяц не существует");
        }
    }
}
