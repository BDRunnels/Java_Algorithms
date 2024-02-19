import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.imageio.ImageReadParam;



public class AnagramCount {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        
        input.add("code");
        input.add("dcoe");
        input.add("anagrams");
        input.add("ecod");
        input.add("aaangrms");
        input.add("framer");
        input.add("naasmrag");
        input.add("frame");
        
        System.out.println("Input :" + input);
        System.out.println(anagramCheck(input));
    }

    public static List<String> anagramCheck(List<String> input) {
        // List<String> answer = new ArrayList<>();
        // HashMap<Integer, Integer> hash = new HashMap<>();

        // int hashCount = 0;
        // String first = "";
        // for (String s : input) {
        //     int charCount = getCharCount(s);
        //     if (!hash.containsKey(charCount)) {
        //         hash.put(charCount, hashCount);
                
        //         System.out.println("first, in 1st if: " + first);
        //     } else if (hash.containsKey(charCount)) {
        //         hash.put(charCount, hash.get(charCount) + 1); 
        //         System.out.println("Inside else");
        //     }
        //     if (hash.get(charCount) > 0 && !answer.contains(first)) {
        //         System.out.println("Inside 2nd if");
        //         answer.add(first);
        //     }
        //    return answer;  
        // }

        
        // System.out.println(hash);
        // List<String> answer = new ArrayList<>();
        // HashMap<String, String> firstAnagramMap = new HashMap<>();

        // for (String s : input) {
        //     char[] charArray = s.toCharArray();
        //     Arrays.sort(charArray);
        //     String sortedString = new String(charArray);

        //     if (!firstAnagramMap.containsKey(sortedString)) {
        //         // Keep the first seen anagram
        //         firstAnagramMap.put(sortedString, s);
        //         answer.add(s);
        //     }
        // }

        // // Sort the list of first anagrams
        // answer.sort(String::compareTo);

                // MY BEST ATTEMPT
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            String iElement = input.get(i);
            System.out.println("OUTER LOOP #" + (i+1));
            for (int j = i + 1; j < input.size(); j++) {
                String jElement = input.get(j);
                char[] charI = iElement.toCharArray();
                char[] charJ = jElement.toCharArray();
                Arrays.sort(charI);
                Arrays.sort(charJ);
                
                iElement = new String(charI);
                jElement = new String(charJ);
                System.out.println("iEle " + iElement);
                System.out.println("    jEle " + jElement);
                if (iElement.equals(jElement) && !answer.contains(iElement)) {
                    answer.add(iElement);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }

    public static int getCharCount(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            count += c;
        }
        return count;
    }
}
