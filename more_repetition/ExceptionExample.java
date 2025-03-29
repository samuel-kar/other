package repetera.objects.more_repetition;

public class ExceptionExample {
    public static void main(String[] args) {
        calculateNumber(101,3);
        try{
            int a = 42/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("You've made a bobo.");
        } finally {
            System.out.println("All good in the hood, we're here to learn.");
        }

    }
    public static void calculateNumber(int numberOne, int numberTwo){
        if(numberOne>100){
            throw new IllegalArgumentException("We do not allow too big numbers here..");
        }
    }
}
