import java.util.Arrays;

public class ChocolateWeights {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] input = {30, 20, 25};
        int[] result = findWeight(input, 4);
        System.out.println(Arrays.toString(result));

        // int[] result1 = findWeights(input, 4);
        // System.out.println(Arrays.toString(result1));

        // System.out.println(Arrays.toString(findWeight1(input, 4)));
    }

    public static int[] findWeight(int[] weights, int days) {

        while (days > 0) {

            Arrays.sort(weights);
            int largestEle = weights[weights.length - 1];
            
            if (largestEle % 2 != 0) {
                weights[weights.length - 1] = (largestEle / 2) + 1;
            } else {
                weights[weights.length - 1] /= 2;
            }
            
            days--;
        }
        Arrays.sort(weights);
        
        return weights;

    }

    public static int[] findWeights(int[] weights, int days) {
        
        while (days > 0) {
             // Sort initial array
            for (int i = 0; i < weights.length - 1; i++) {
                if (weights[i] > weights[i + 1]) {
                    int temp = weights[i];
                    weights[i] = weights[i + 1];
                    weights[i + 1] = temp;
                }
            }

                
            // Half biggest weight
            weights[weights.length - 1] = weights[weights.length - 1] / 2;
            days--;
        }
           
        
        return weights;
    }

    public static int[] findWeight1(int[] weights, int days) {
        while (days > 0) {
            days--;

            // Find the index of the largest weight
            int indexOfLargest = findIndexOfLargest(weights);

            // Halve the largest weight
            weights[indexOfLargest] /= 2;
        }
;

        return weights;
    }

    public static int findIndexOfLargest(int[] arr) {
        int indexOfLargest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[indexOfLargest]) {
                indexOfLargest = i;
            }
        }
        return indexOfLargest;
    }
}
