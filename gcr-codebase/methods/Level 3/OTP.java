public class OTP {

    //Method to generate six digit otp
    public static int generateSixDigitsOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    //Method to determine whether the otps are unique or not
    public static boolean isUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
   
    public static void main(String[] args) {
 
        int[] otps = new int[10];

        //Calling the method to generate otp iteratively
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateSixDigitsOTP();
        }

        //Printing the otps generated
        System.out.println("Generated OTPs are : ");
        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

        System.out.println(isUnique(otps) ? "All otps are unique" :
                                             "All otps are not unique");
    }
}