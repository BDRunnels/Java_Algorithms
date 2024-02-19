import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhichAreIn {
    public static void main(String[] args) {
        String[] a = {"arp", "live", "strong"};
        String[] a1 = {"tarp", "mice", "bull"};
        String[] b = {"lively", "alive", "harp", "sharp", "armstrong"};


        String[] result = inArray(a1, b);
        System.out.println(Arrays.toString(result));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> result = new HashSet<>();
    
        for(String a1 : array1) {
            System.out.println("a1 in loop: " + a1);
            for(String a2 : array2) {
                System.out.println("    a2 in loop: " + a2);
                if(a2.contains(a1)) {
                    result.add(a1);
                    break;
                }
            }
        }
        
        String[] resultArray = result.toArray(new String[result.size()]);
        
        Arrays.sort(resultArray);
        
        return resultArray;
   }
}
