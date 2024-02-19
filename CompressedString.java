public class CompressedString {
    public static void main(String[] args) {
            
    // PROMPT: Implement a method to perform basic string compression using the counts of repeated characters.

    // For example, the string "aabcccccaaa" would become "a2b1c5a3". 

    // If the "compressed" string would not become smaller than the original string, your method should return the original string.

    // You can assume the string has only uppercase and lowercase letters (from a to z). 
        String test = "aabcccccaaa";
        String test2 = "abbbbdfffhhjjjjjjkkzllllmm";
        String test3 = "abcdddddddd";
        System.out.println(compressString(test3));
    }

    private static String compressString(String s) {
        if (s.length() <= 1) return s;

        // Converting `s` to character array
        char[] cArray = s.toCharArray();
        // Initiliaze variable to keep track of occurrences
        int charCount = 1;
        char current = cArray[0];
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < cArray.length; i++) {
            if (cArray[i] == current) {
                charCount++;
            } else {
                answer.append(current).append(charCount);
                current = cArray[i];
                charCount = 1;
            }
        }

        answer.append(current).append(charCount);

        return answer.length() >= s.length() ? s : answer.toString();
    }
}
