import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {

    private Map<String, Double> rates;

    public CurrencyConverter() {
        rates = new HashMap<>();
        
        // Пример курсов (можно потом подключить API)
        rates.put("USD", 1.0);
        rates.put("EUR", 0.93);
        rates.put("RUB", 90.0);
        rates.put("GBP", 0.79);
    }

    public double convert(String from, String to, double amount) {
        if (!rates.containsKey(from) || !rates.containsKey(to)) {
            throw new IllegalArgumentException("Неверная валюта");
        }

        double usdAmount = amount / rates.get(from);
        return usdAmount * rates.get(to);
    }
}
