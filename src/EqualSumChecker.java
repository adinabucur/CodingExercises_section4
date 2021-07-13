public class EqualSumChecker {
    public static void main(String[] args) {

        boolean result = hasEqualSum(1,1,2);
        System.out.println(result);
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber == thirdNumber;
    }
}
