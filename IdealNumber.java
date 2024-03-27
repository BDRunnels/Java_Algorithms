import java.util.LinkedList;
import java.util.List;

public class IdealNumber {
    

    // Function to count the number of ideal integers within a given range
    static int countIdealNumbers(int low, int high) {
        int count = 0;
        List<Integer> numbers = new LinkedList<>();

        for (int i = low; i <= high; i++) {
            if (i % 15 == 0) {
                count++;
                numbers.add(i);
            }
        }
        System.out.println("Ideal integers between " + low + " and " + high + " = " + numbers);
        return count;
    }

    public static void main(String[] args) {
        int low = 200;
        int high = 405;
        int idealCount = countIdealNumbers(low, high);
        System.out.println("Number of ideal integers between " + low + " and " + high + " inclusive: " + idealCount);
    }
}
