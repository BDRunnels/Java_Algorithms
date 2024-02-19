public class SquaresCount {
    public static void main(String[] args) {
        // Example usage
        int result = countSquares(8, 24);
        System.out.println(result);  // Output: 2
    }
    static int countSquares(int a, int b) {
        // Find the nearest perfect squares

        // lowerSqrt finds SMALLEST PERFECT SQUARE GREATER THAN OR EQUAL TO `a`.
        int lowerSqrt = (int) Math.ceil(Math.sqrt(a));
        // upperSqrt finds LARGEST PERFECT SQUARE LESS THAN OR EQUAL TO `b`.
        int upperSqrt = (int) Math.floor(Math.sqrt(b));

        System.out.println("smallest perfect square >= " + a + ": " + lowerSqrt);

        System.out.println("largest perfect square <= " + b + ": " + upperSqrt);
        // Count the squares within the range - MUST ADD 1 to account for the upper bound (upperSqrt).
            // if you don't ADD 1, it will only include the lowerSqrt and any subsequent ones.
            // Here if a = 3, b = 9... lower = 2, upper = 3... 3 - 2 = 1. IT IS NOT CORRECT, there are 2 perfect squares in between 3 and 9 (4 and 9).
            // if a = 7, b = 35...lower = 3, upper = 5... 5 - 3 = 2. NOT CORRECT, there are 3 perfect squares in between 7 and 35 (9, 16, 25).
        int count = Math.max(0, upperSqrt - lowerSqrt + 1);

        return count;
    }
}
