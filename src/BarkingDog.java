public class BarkingDog {
    public static void main(String[] args) {

        shouldWakeUp(false, 4);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
            return false;
        }
        return true;
    }
}

