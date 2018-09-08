package BarkingDog;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(bark(true, -1));

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        // wake up before 8am  or after 22 hour
        if (barking == true) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
                //less than 0 and greater than 23
            } else if (hourOfDay < 0 || hourOfDay < 24) {
                return false;
            }
        }
        return false;
    }


}
