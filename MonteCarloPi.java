import java.util.Random;

public class MonteCarloPi {
    public static void main(String[] args) {
        final int n = 1000000;  // Number of random points
        double x, y;
        int count = 0;
        
        // Create random number generator
        Random random = new Random();
        
        // Generate random points and count those inside the circle
        for (int i = 0; i < n; i++) {
            x = random.nextDouble();
            y = random.nextDouble();
            
            if (x * x + y * y <= 1.0) {
                count++;
            }
        }
        
        // Calculate π approximation
        double piApproximation = 4.0 * count / n;
        System.out.println("Approximation of π using Monte Carlo method: " + piApproximation);
    }
}

