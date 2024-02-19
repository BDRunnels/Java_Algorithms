public class EditSingleTime {
    public static void main(String[] args) {
        /* PROMPT: There are 3 types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away. 

        Examples:
        * "pale" and "ple" would return true 
        * "pales" and "pale" would return true
        * "pale" and "bale" would return true
        * "pale" and "bake" would return false

        Hints: 
        #1. Start with the easy thing. Can you check each of the conditions separately? 
        #2. What is the relationship between the "insert character" option and the "remove character" option? Do these need to be two separate checks? 
        #3. Can you do all three checks in a single pass? 

        */ 
        String s1 = "pale";
        String s2 = "bake";
        // Expected return `true`
        System.out.println(editSingle(s1, s2));
    }

    private static boolean editSingle(String s1, String s2) {

        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false ; //difference between is greater than 1. Can't make same in one edit.
        }

        int pointerOne = 0;
        int pointerTwo = 0;
        boolean foundDifference = false;

        while (pointerOne < s1.length() && pointerTwo < s2.length()) {
            if (s1.charAt(pointerOne) != s2.charAt(pointerTwo)) {
                if (foundDifference) return false; 

                foundDifference = true;

                if (s1.length() == s2.length()) {
                    pointerTwo++;
                }
            } else {
                pointerTwo++;
            }
            pointerOne++;
        }

        return true;
    }
}
