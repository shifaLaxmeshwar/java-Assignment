
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    static int search(int arr[], int start, int end, int value){
        int mid;
        if(end>=start){
            mid = (start + end)/2;
            if(arr[mid]==value){
                return mid ;
            }
            else if(arr[mid]<value){
                return search(arr,mid+1,end,value);
            }
            else{
                return search(arr,start,mid-1,value);
            }
        }
        else
            return -1;

    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter numbers");
            for(int i =0 ;i < n ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            //System.out.println(Arrays.toString(arr));
            System.out.println("enter the value you want to search");
            int value = sc.nextInt();

            System.out.println(n);
            int result = search(arr, 0, n - 1, value);
            if (result == -1) {
                System.out.println("value not found");

            } else {
                System.out.println("Value found at index " + (result));
            }
        }
        catch (Exception e){
            System.out.println("invalid");
        }
    }

}