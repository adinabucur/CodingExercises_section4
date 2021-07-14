public class EqualSumChecker {
    public static void main(String[] args) {

        hasEqualSum(1,1,2);

    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber == thirdNumber;
    }
}
