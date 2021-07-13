public class TeenNumberChecker {
    public static void main(String[] args) {

        boolean result = hasTeen(15, 99, 500);
        System.out.println(result);
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        return isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber);
    }

    public static boolean isTeen(int myValue) {
        return myValue > 12 && myValue < 20;
    }
}
