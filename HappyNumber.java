import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        boolean result = isHappy(25);
        System.out.println(result);
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        
        while (n != 1 && !seen.contains(n)) {
            
            seen.add(n);
            System.out.println("Seen after seen.add(n) = " + seen);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                System.out.println("Digit: " + digit);
                sum += (digit * digit);
                System.out.println("Sum: " + sum);
                n = n / 10;
                System.out.println("n after n/10: " + n);
            }

            n = sum;
        }
        System.out.println("After breaking out of outer while loop, n = " + n);
        System.out.println("Is n in HashSet seen: " + seen.contains(n));

        return n == 1;
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            
            int digit = n % 10;
            System.out.println("Digit " + digit);
            sum += digit * digit;
            System.out.println("Sum " + sum);
            n /= 10;
        }
        return sum;
    }
}


