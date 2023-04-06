import java.math.BigInteger;
import java.util.Scanner;

public class add {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double add = 0;
       try {
           System.out.println("enter num1 ");
           double a = sc.nextDouble();

           System.out.println("enter num2 ");
           double b = sc.nextDouble();
            add = a + b;
       }
       catch (Exception v){
            System.out.println("enter valid number");
        }

        System.out.println("which addition \n 1 for only integers \n 2 for only float \n 3 for any datatype");
        int choice = sc.nextInt();
        if (choice == 1) {
            int myInt = (int) add;
            System.out.println("addition of numbers is  :" + myInt);
        } else if (choice == 2) {
            float myfloat = (float) add;
            System.out.println("addition of numbers is :" + myfloat);
        } else {
          double mix = (double) add;
            System.out.println("addition of numbers : " + mix);
        }
    }
}
