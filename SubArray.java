public class SubArray {
    public static void main(String[] args) {
        int[] array = {4,5,6};
        int result = sumOfAllSubarrays(array);
        System.out.println(result);
    }

    public static int sumOfAllSubarrays(int[] nums) {
        int totalSum = 0;
        // int indexCount = 3;
        // Iterate over all possible subarrays
        for (int i = 0; i < nums.length; i++) {
            int subarraySum = 0;
            // totalSum += (nums[i] * indexCount++);
            for (int j = i; j < nums.length; j++) {
                System.out.println("Current jEle : " + nums[j]);
                // Calculate the sum of the current subarray [i, j]
                subarraySum += nums[j];
                System.out.println("    subArray " + subarraySum);
                System.out.println("        totalSum " + totalSum);
                // Add the sum to the total sum
                totalSum += subarraySum;
                System.out.println("        totalSum after adding " + subarraySum + " = " + totalSum);
            }
        }

        return totalSum;
    }
}
