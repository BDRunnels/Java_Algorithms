import java.util.Random;

public class GaussianExample {
    public static void main(String[] args) {
        Random random = new Random();
        double randomNumber = random.nextGaussian();
        System.out.println("Random number from Gaussian distribution: " + randomNumber);

        // REAL-WORLD EXAMPLE
        // Parameters for the test scores distribution
        double meanScore = 75.0;
        double stdDev = 10.0;
        int numStudents = 1000; // Total number of students taking the test

        // Create a Random object
        Random random1 = new Random();

        // Simulate test scores for each student
        System.out.println("Student\tScore");
        for (int i = 1; i <= numStudents; i++) {
            double score = meanScore + stdDev * random1.nextGaussian(); // Generate a random score
            System.out.printf("%d\t%.2f%n", i, score);
        }
    }
}