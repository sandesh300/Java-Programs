// Program to check the Armstrong Number using method. 

public class ArmstrongNumberMethod {

    public static void main(String[] args) {
        int no = 153;

        if (isArmstrong(no)) {
            System.out.println(no + " is an Armstrong number");
        } else {
            System.out.println(no + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int number) {
        int temp = number;
        int result = 0, rem;

        while (temp > 0) {
            rem = temp % 10;
            result = result + rem * rem * rem;
            temp = temp / 10;
        }

        return result == number;
    }
}
