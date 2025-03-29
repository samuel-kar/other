package repetera.objects.more_repetition;

public class RoundingNumbers {
    public static void main(String[] args) {
        double number1 = 5.555;
        double number2 = 10.123456789;

        double calc = number1+number2;

        System.out.println(String.format("%.2f", calc));
    }
}
