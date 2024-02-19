import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        reverse("hello, world!");

        int[] test = {5,3,2,6,7,8,4};
        int[] result = bubbleSort(test);

        System.out.println(Arrays.toString(result));
        System.out.println("-".repeat(30));

        String[] test1 = {"zebra", "hello", "world", "apple", "car", "could", "hi"};
        String result1 = bubbleStringSort(test1);
        System.out.println(result1);

        System.out.println(bubbleCharSort("zebra" + "hello" + "world" + "apple" + "car" + "could" + "hi"));
    }

    public static String reverse(String s) {
        char[] cArray = s.toCharArray();
        StringBuilder newString = new StringBuilder();

        // string is "hello, world!";
            // reverse
        
        int rightIndex = cArray.length - 1;

        while (rightIndex >= 0) {
            newString.append(cArray[rightIndex]);
            rightIndex--;
        }
        System.out.println(newString);
        return s;
    }

    public static int[] bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0 ; i < array.length - 1; i++) {
    
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.println("Times in nested loop " + (++count));

                if (array[j] > array[j+1]) {
                    System.out.println("Inside if");
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
        // for (int i = 0; i < array.length - 1; i++) {
        //     for (int j = 0; j < array.length - 1; j++) {
        //         if (array[j] > array[j + 1]) {
        //             // Swap array[j] and array[j + 1]
        //             int temp = array[j];
        //             array[j] = array[j + 1];
        //             array[j + 1] = temp;
        //         }
        //     }
        // }
        // return array;
    }

        public static String bubbleStringSort(String[] array) {
            int n = array.length;
        
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    // Compare adjacent strings using compareTo
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        // Swap array[j] and array[j + 1]
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        
            return String.join(" ", array);
    }

    public static String bubbleCharSort (String s) {
        char[] cArray = s.toCharArray();
    int n = cArray.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (cArray[j] > cArray[j + 1]) {
                char temp = cArray[j];
                cArray[j] = cArray[j + 1];
                cArray[j + 1] = temp;
            }
        }
    }

    return String.join(" ", String.valueOf(cArray));
    }
}
