import java.util.Arrays;
import java.util.Scanner;

public class anagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter two Strings");
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            if (s1.length() != s2.length()) {
                System.out.println("String are not anagram");
            } else {
                char[] str1 = s1.toCharArray();
                char[] str2 = s2.toCharArray();

                Arrays.sort(str1);
                Arrays.sort(str2);
                if (Arrays.equals(str1, str2)) {
                    System.out.println("String are anagram");
                } else {
                    System.out.println("Strings are not anagram");
                }
            }

        } catch (Exception e) {
            System.out.println(" only Stirng is allowed....  ");
        }
    }
}