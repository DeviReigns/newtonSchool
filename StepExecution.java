import java.util.Scanner;

public class StepExecution {

        public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner (System.in);
            System.out.print("Please Enter 4 Digit Number:");
            int num = sc.nextInt();
            if (1000 <= num  && num <= 9999)
            {
            System.out.println((((8+num)/3)%5)*5);
            }
            else
            {
                System.out.println("Please Enter Valid Number");
            }
        }

}
