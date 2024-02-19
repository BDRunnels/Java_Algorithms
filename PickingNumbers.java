import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);

        int result = pickingNumber(list);
       System.out.println("result: " + result);
    }

    public static int pickingNumber(List<Integer> a) {
        // initialize variable to `count` longest list
        int count = 0;
        // initialize `list` to hold new items that meet criteria
        List<Integer> list = new ArrayList<>();
        // sort in ascending order input `a`.
        a.sort(Comparator.naturalOrder());
       
        // sorted input: [1, 1, 2, 2, 4, 4, 5, 5, 5]

        // for loop to iterate through list
        for (int i = 0; i < a.size(); i++) {
            // for loop to iterate through each individual element. 
            for (int j = i; j < a.size(); j++) {
                // if i_th element - j_th element is LESS THAN OR EQUAL TO 1, taking absolute value (negative becomes positive) so answer will always be 1 if it is negative 1. We don't want to count -2, -3, and so forth.
                if (Math.abs(a.get(i) - a.get(j)) <= 1) {
                    // add j_th element to created `list`. Including the first i_th element each time to start the list.
                    list.add(a.get(j));
                }
            }
            // if count is LESS THAN the size of the list. Count will equal the size of the list.
            if (count < list.size()) {
                count = list.size();
            }
            System.out.println("list: " + list);
            // clear the list, iteration of i_th element is complete, count is updated if needed.
            list.clear();
        }
        
        // return count.
        return count;

        // int maxLength = 0;

        // for (int i = 0; i < a.size(); i++) {
        //     int currentElement = a.get(i);
        //     int currentCount = 0;
        //     System.out.println("Current element: " + currentElement);
        //     for (int j = 0; j < a.size(); j++) {
        //         System.out.println("Element at j: " + a.get(j));
        //         int difference = Math.abs(currentElement - a.get(j));

        //         if (difference == 0 || difference == 1) {
        //             currentCount++;
        //         }
        //     }
        //     System.out.println("currentCount: " + currentCount);
        //     System.out.println("maxLength: " + maxLength);
        //     maxLength = Math.max(maxLength, currentCount);
        // }

        // return maxLength -1;

        // int maxLength = 0;

        // for (int i = 0; i < a.size(); i++) {
        //     List<Integer> list = new ArrayList<>();
        //     list.add(a.get(i));

        //     for (int j = 0; j < a.size(); j++) {
        //         if (i != j) {  // Avoid comparing the same element
        //             int difference = Math.abs(a.get(i) - a.get(j));

        //             if (difference == 0 || difference == 1) {
        //                 list.add(a.get(j));
        //             }
        //         }
        //     }
        //     maxLength = Math.max(maxLength, list.size());
        // }
        
        // return maxLength;

        
            // Write your code here
                // int result = 0;
                // Collections.sort(a);
                // System.out.println(a);
                // List<Integer> subArr = new ArrayList<>();
                // for(int i = 0; i < a.size(); i++){
                //     for(int j = i; j < a.size(); j++){
                //         System.out.println("a.get[i]: " + a.get(i));
                //         System.out.println("a.get(j) : " + a.get(j));
                //         if(Math.abs(a.get(i) - a.get(j)) <= 1){
                //             subArr.add(a.get(j));
                //         }
                //     }
                //     if(result < subArr.size()){
                //         result = subArr.size();
                //     }
                //     System.out.println("subArray:" + subArr);
                //     subArr.clear();
                // }
                // return result;
    }
}
