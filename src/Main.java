import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        List<Double> doubleList = List.of(2.0, 3.5, 4.0);
        System.out.println("Сумма doubleList: " + calculator.sum(doubleList));

        List<Integer> integerList = List.of(2, 3, 4);
        System.out.println("Сумма integerList: " + calculator.sum(integerList));

        int intValue = 10;
        String binaryInt = calculator.binaryConversion(intValue);
        System.out.println("Бинарное представление числа " + intValue + ": " + binaryInt);

        double doubleValue = 3.0;
        String binaryDouble = calculator.binaryConversion(doubleValue);
        System.out.println("Бинарное представление числа " + doubleValue + ": " + binaryDouble);

        String stringInput = "7";
        String binaryString = calculator.binaryConversion(stringInput);
        System.out.println("Бинарное представление числа " + stringInput + ": " + binaryString);
    }
}