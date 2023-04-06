import java.util.Scanner;
public class swap implements swapNumbers {
    public void swapNumberTemp(int num1, int num2) {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("swapped numbers are :" + "a : " + num1 + " and  b : " + num2);
    }

    public void swapNumbersDefault(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("swapped numbers are :" + "a : " + num1 + " and  b : " + num2);
    }


    public static void main(String[] args) {
        int num1, num2;
        try {
            System.out.println("enter two numbers to swap without temp variable");
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("before swapping: " + " a : " + num1 + " and  b : " + num2);
            swap a = new swap();
            a.swapNumberTemp(num1, num2);
            a.swapNumbersDefault(num1, num2);

        } catch (Exception e) {
            System.out.println("enter integer");
            ;
        }
    }
}
