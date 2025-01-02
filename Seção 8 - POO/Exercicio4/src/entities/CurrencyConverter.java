package entities;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double converter(double currentDolar, double boughtDollar) {
        return (currentDolar * boughtDollar) * (1.0 + IOF);
    }
}
