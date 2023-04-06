import java.util.Scanner;

public class addNumbers {
    public static  void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" which type of additon you want ? enter 1 for interger addition ,\n enter 2 for float addition and 3 for integer and float addition");
            int var = sc.nextInt();
            if (var == 1) {
                System.out.println("enter two number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("You entered : " + a + " and  " + b);
                int add = a + b;
                System.out.println("Addition is :" + add);
            }
            else if (var == 2) {
                System.out.println("enter two number");
                Float a = sc.nextFloat();
                Float b = sc.nextFloat();
                System.out.println("You entered : " + a + " and  " + b);
                Float add = a + b;
                System.out.println("Addition is :" + add);
            }

                 else {
                try{
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();

                    System.out.print("Enter a second number : ");
                    double num2 = sc.nextDouble();

                    double result = num1 + num2;

                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
                    }
                catch (Exception v){

                    System.out.println("Invalid input. Please enter a valid integer and float number.");

                }
            }
        }
        catch(Exception e ){
            System.out.println("please enter valid integer");
        }


    }
}
