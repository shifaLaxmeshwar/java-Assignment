import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class characterOccurrence {
    public static void main(String[] args) {
        /*
         * You are given a string “aabsbvegbevsdcwdcacxwcxwdfvevcwdxcdvrvfwvccwdv”,
         * You have to remove all character from given string which is having even number of frequency.
         * */

        Map<Character, Integer> map = new HashMap<>();
        try {
            System.out.println("Enter the long stream of string");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();


            for (int i = 0; i < str.length(); i++) {
                if (map.containsKey(str.charAt(i))) {
                    Integer val = map.get(str.charAt(i));
                    val = val + 1;
                    map.replace(str.charAt(i), val);
                } else {
                    map.put(str.charAt(i), 1);
                }
            }

            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " : " + m.getValue());
            }

            for (Map.Entry m : map.entrySet()) {
                Integer frequency = (Integer) m.getValue();
                Character key = (Character) m.getKey();
                if (frequency == 1)
                    str = str.replaceAll(String.valueOf(key), "");
            }
            System.out.println("Final string : " + str);
        }
        catch(Exception e){
            System.out.println("Exception occured enter string");
        }

    }
}
