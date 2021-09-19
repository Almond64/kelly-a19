import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = Integer.parseInt(input.next());
        int w = Integer.parseInt(input.next());
        double bmi = (w*1.0/(h*h))*703;
        System.out.printf("Your BMI is %.2f.\n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        } else if (bmi < 25) {
            System.out.println("You are within the ideal weight range.");
        } else {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
