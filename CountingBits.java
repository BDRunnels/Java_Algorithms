import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CountingBits {
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }

    public static boolean isPowerOfTwo(int n) {
        // return n > 0 && (n & (n - 1)) == 0;
        // return n > 0 && Integer.bitCount(n) == 1;
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
            System.out.println(n);
        }
        return n == 1;
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1; // Unsigned right shift
        }
        return count;
    }
    
    // STRING -> CHARCTER ARRAY -> Char to binary (charToBinary(char));
    private static String charToBinary(char c) {
        // Convert the character to its binary representation
        String binaryRepresentation = Integer.toBinaryString(c);

        // Ensure that the binary representation has 8 bits by padding with leading zeros if needed
        while (binaryRepresentation.length() < 8) {
            binaryRepresentation = "0" + binaryRepresentation;
        }

        return binaryRepresentation;
    }

    private static int charToInteger(char c) {
        // Convert the binary representation to an integer
        System.out.println(String.valueOf(8)); 
        return Integer.parseInt(charToBinary(c));
    }

    public static void main(String[] args) {

        // Counting Bits -> for every number `i` from `0` to `num`, calc # of 1 bits in its binary rep.
        int[] result = countBits(5);
        System.out.println(Arrays.toString(result));

        // Single Number -> array of integers where every element appears twice except for one, find that single element.
        int[] nums = {2,2,1,3,3};
        int snResult = singleNumber(nums);
        System.out.println(snResult);

        // Power of Two -> determines if int `n` is a power of two.
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(18));
        System.out.println(isPowerOfTwo(32));
        System.out.println(isPowerOfTwo(64));

        // Number of 1 Bits -> given an unsigned number, return number of `1` bits.
        System.out.println(hammingWeight(11));

        // charToBinary -> Convert char to binary rep -> Ensure binary rep has 8 bits by padding it with `0`, if needed.
        String inputString = "Hello, World!";
        char[] characters = inputString.toCharArray();
        for (char c : characters) {
            System.out.println("Character: " + c);
            System.out.println("Binary Rep: " + charToBinary(c));
            System.out.println("Integer Value: " + charToInteger(c));
            System.out.println("-".repeat(30));
        }
        String result2 = new String(characters);

        System.out.println(result2);
    }
}
