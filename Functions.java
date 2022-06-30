import java.util.Scanner;

public class Functions {
//    public static  int calculateSum(int a, int b)
//    {
//        int sum = a + b;
//        return sum;
//    }
//    public  static  int calculateProduct(int m, int n)
//    {
//        return  m * n;
//    }

    public static void printFactorial(int n)
    {
        if (n < 0)
        {
            System.out.println("invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("The Factorial " +n+ " Is: " + factorial);
        return;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Please Enter 1st number: " );
//        int a = sc.nextInt();
//        System.out.print("Please Enter 2nd number: " );
//        int b = sc.nextInt();
//
//        int sum = calculateSum(a, b);
//        System.out.println("The Sum Of Two Numbers Is: " +sum);

//        System.out.print("Please Enter 1st number: " );
//        int m = sc.nextInt();
//        System.out.print("Please Enter 2nd number: " );
//        int n = sc.nextInt();
//
//        System.out.println("The Product Of Two Numbers Is: " +calculateProduct(m, n));

        System.out.print("Please Enter Number: " );
        int n = sc.nextInt();

        printFactorial(n);

    }
}
