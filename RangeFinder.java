/* 
A format for expressing an ordered list of integers is to use a comma separated list of either

individual integers
or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'. The range includes all integers in the interval including both endpoints. It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.

Example:

Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
# returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
*/

public class RangeFinder {
    public static void main(String[] args) {
        String answer = rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20});
        System.out.println(answer);
    }

	private static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            s += arr[i];
            int j = i;
            while (j < arr.length - 1 && arr[j] + 1 == arr[j + 1]) j++;
            if (i + 1 < j) {
                i = j; // reassigning i to correct position in array
                sb.append("to");
                s += "to";
                sb.append(arr[j]);
                s += arr[j];
            }
            sb.append(",");
            s += ",";
        }
        sb.setLength(sb.length() - 1);
        s = s.substring(0, s.length() - 1);

        boolean f = sb.toString().equals(s);
        System.out.println(f);
        return sb.toString();
    }
}
