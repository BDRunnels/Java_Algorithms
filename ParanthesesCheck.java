import java.util.Arrays;
import java.util.HashMap;

public class ParanthesesCheck {
    public static void main(String[] args) {
        boolean result = isValid("((({{[])})})");
        System.out.println(result);

        boolean result1 = isValid1("((({{[])})})");
        System.out.println("Result1 = " + result1);

        boolean result3 = isValid2("()(){[()]}");
        System.out.println("Result3 = " + result3);
    }

    public static boolean isValid(String s) {
        String[] split = s.split("");
        System.out.println(Arrays.toString(split));

        int paran = 0;
        int curly = 0;
        int square = 0;
        for (int i = 0; i < split.length; i++) {

            if (split[0].equals(")") || split[0].equals("]") || split[0].equals("}")) return false;
            
            if (split[i].equals("(")) paran++;
            if (split[i].equals(")")) paran--;

            if(split[i].equals("[")) square++;
            if(split[i].equals("]")) square--;

            if(split[i].equals("{")) curly++;
            if(split[i].equals("}")) curly--;

            System.out.print(" Paran " + paran);
            System.out.print(" Square " + square);
            System.out.print(" Curly " + curly + "\n");
            if (paran < 0 || square < 0 || curly < 0) return false;

            
        }
        
        return paran == 0 && curly == 0 && square == 0;

    }

    public static boolean isValid1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+ 1);
            
        }

        // for (var entry : map.entrySet()) {
        //     char key = entry.getKey();
        //     int value = entry.getValue();

        //     if ((key == ')' && value > map.get('(')) ||
        //         (key == ']' && value > map.getOrDefault('[', 0)) ||
        //         (key == '}' && value > map.getOrDefault('{', 0))) {
        //             return false; // Closing paranthesis count is greater than opening
        //         }
            
        // }
        int openCount = map.get('(') + map.get('[') + map.get('{');
        int closeCount = map.get(')') + map.get(']') + map.get('}');

        return openCount == closeCount;

    }

    public static boolean isValid2(String braces) {
      
        int lengthOfBraces = braces.length();
        
        for(int i = 0; i < lengthOfBraces; i++){
          
          braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
          
        }
        return braces.isEmpty();
    }
}
