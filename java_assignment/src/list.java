import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        int list[] = new int[20];
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter the number list of integers");
            int n = sc.nextInt();
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                list[i] = sc.nextInt();
            }
            System.out.println("Array elements are: ");

            for (int i = 0; i < n; i++) {
                System.out.println(list[i]);
            }
            int even = 0;
            int c=0;
            for (int i = 0; i < n; i++) {
                if (list[i] % 2 == 0) {
                    even++;
                } else {
                    c=1;
                   continue;
                }
            }
            if (even >= 1 && (c!=1))
            {
                System.out.println("only even");
            }
            else if (even ==0 &&(c==1) )
            {
                System.out.println("only odd");
            }
            else
                System.out.println("both");


        } catch (Exception o) {
            System.out.println("invalid input ");
        }

    }
}