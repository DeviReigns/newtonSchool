import java.util.Scanner;

public class Arrays {
    public static void main(String args[])
    {
       // int[] marks=new int[3];
// //       int marks[] = new int[3];
   ////     int marks[] = {98, 95, 90, 45};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please Enter Array Size: ");
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//        marks[0] = 98; //phy
//        marks[1] = 95; //chem
//        marks[2] = 90; //eng
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        for (int i=0; i<size; i++)
//        {
//            numbers[i] = sc.nextInt();
//        }
//
//        for (int i=0; i<size; i++)
//        {
//            System.out.println(numbers[i]);
//        }
        Scanner sc =new Scanner(System.in);
        System.out.print("Please Enter Size of Array: ");
        int size = sc.nextInt();
        int numbers[] = new  int[size];

        //Input
        for (int i=0; i<size; i++)
        {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Please enter value of X: ");
        int x = sc.nextInt();

        //Output
        for (int i=0; i< numbers.length; i++)
        {
            if (numbers[i] == x)
            {
                System.out.println("X is found at index: " + i);
            }

        }
    }
}
