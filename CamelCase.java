import java.util.Arrays;

public class CamelCase {
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        camelcase(s);
    }

    public static int camelcase(String s) {
        // Write your code here
            int count = 1;
            
            String[] array = s.split("");
            System.out.println(Arrays.toString(array));
            
            for (String str : array) {
                System.out.println(str);
                if (str.toUpperCase().equals(str)) count++;
            }
            return count;
        }
}
