import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("=== Конвертер валют ===");

        System.out.print("Введите сумму: ");
        double amount = scanner.nextDouble();

        System.out.print("Из валюты (USD, EUR, RUB, GBP): ");
        String from = scanner.next().toUpperCase();

        System.out.print("В валюту (USD, EUR, RUB, GBP): ");
        String to = scanner.next().toUpperCase();

        try {
            double result = converter.convert(from, to, amount);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
