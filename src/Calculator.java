import java.util.List;

public class Calculator {

    public double sum(List<? extends Number> numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    public String binaryConversion(int number) {
        return Integer.toBinaryString(number);
    }

    public String binaryConversion(double number) {
        long roundedValue = Math.round(number);
        return Long.toBinaryString(roundedValue);
    }

    public String binaryConversion(String input) {
        try {
            int number = Integer.parseInt(input);
            return binaryConversion(number);
        } catch (NumberFormatException e) {
            double doubleValue = Double.parseDouble(input);
            return binaryConversion(doubleValue);
        }
    }
}
