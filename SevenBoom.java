// Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

// Examples
// sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
// // 7 contains the number seven.

// sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
// // None of the items contain 7 within them.

// sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
// // 97 contains the number seven.
public class SevenBoom {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] array2 = {8,6,33,100};
        int[] array3 = {2,33,60,94,86,1700};

        // method
        System.out.println(sevenInArray(array));
        System.out.println(sevenInArray(array2));
        System.out.println(sevenInArray(array3));
        
    }

    private static String sevenInArray(int[] array) {

        for (int num : array) {
            while (num > 0) {
                System.out.println("Before if check:\t\t" + num);
                if (num % 10 == 7) return "Boom!";
                
                num /= 10;
                
            }
        }
        return "there is no 7 in the array";
    }

}