import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 1st number:");
        int a = sc.nextInt();

        System.out.println(a);
    }
}
