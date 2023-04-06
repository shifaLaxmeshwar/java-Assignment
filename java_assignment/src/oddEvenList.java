import java.util.Scanner;

public class oddEvenList {
    public static void main(String[] args) {
        int list[] = new int[20];
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter the number list of integers");
           int n=sc.nextInt();
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<n; i++)
            {
                list[i]=sc.nextInt();
            }
            System.out.println("Array elements are: ");

            for (int i=0; i<n; i++)
            {
                System.out.println(list[i]);
            }
            int even =0;
            int odd=0;
            for(int i =0;i<n;i++){
                if( list[i]% 2 ==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(even>=1 && odd ==0){
                System.out.println("The given list contains only even numbers");

            }
            else if(even==0 && odd >= 1){
                System.out.println("The list contains of only odd number");
            }
            else{
                System.out.println("The list contains both even and odd integers");
            }
        }
        catch(Exception o){
            System.out.println("invalid input ");
        }
    }
}