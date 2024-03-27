public class RecursiveDigitCount {
    public static void main(String[] args) {
        System.out.println(count(318));
 
        System.out.println(count(-92563));
        
        System.out.println(count(4666));

        System.out.println(count(-314890));

        System.out.println(count(654321));

        System.out.println(count(638476));
    }

    private static int count(int n) {
        // Base case: if the absolute value of n is less than 10, return 1
        if (Math.abs(n) < 10) {
            return 1;
        }
        // Recursive case: add 1 to the count of digits in n/10 (integer division)
        
        return 1 + count(n /= 10);
    }
}
