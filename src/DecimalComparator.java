public class DecimalComparator {
    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1856, -3.1756);

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int myFirstCheck = (int) (firstNumber * 1000);
        int mySecondCheck = (int) (secondNumber * 1000);

        return myFirstCheck == mySecondCheck; //simplified code

//        if (myFirstCheck == mySecondCheck) {
//            return true;
//        } else {
//            return false;
//        }

    }

}
