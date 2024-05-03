import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    private static final String[] SYMBOLS = {"Cherry", "Lemon", "Orange", "Apple", "Banana"};
    private static final int[] PAYOUTS = {10, 20, 30, 40, 50};
    private static final int INITIAL_BALANCE = 100;
    private static final int BET_AMOUNT = 10;

    private static int balance = INITIAL_BALANCE;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=".repeat(50));
        System.out.println("Welcome to the Slot Machine Game!");
        
        while (balance >= BET_AMOUNT) {
            System.out.println("=".repeat(50));
            System.out.println("Current balance: " + balance);
            System.out.println("-".repeat(50));
            System.out.println("Place your bet (each spin costs " + BET_AMOUNT + "):");

            // Spin the reels
            spin();

            // Ask if the player wants to play again
            System.out.printf("\tBALANCE: %d%n", balance);
            if (balance == 0) break;

            System.out.println("Do you want to play again? (Y/N)");
            String playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("Game over. Your final balance is: " + balance);
        scanner.close();
    }

    private static void spin() {
        balance -= BET_AMOUNT;

        // Generate random symbols for each reel
        String[] reels = new String[3];
        for (int i = 0; i < 3; i++) {
            reels[i] = SYMBOLS[random.nextInt(SYMBOLS.length)];
        }

        // Display the result
        System.out.println("Spinning...");
        System.out.println("\nReels: " + reels[0] + " | " + reels[1] + " | " + reels[2] + "\n");

        // Check for winning combinations
        if (reels[0].equals(reels[1]) && reels[1].equals(reels[2])) {
            int payout = PAYOUTS[getIndex(reels[0])];
            balance += payout;
            System.out.println("Congratulations! You win " + payout + " coins!");
        } else {
            System.out.println("Sorry, you didn't win. :(\n");
        }
    }

    private static int getIndex(String symbol) {
        for (int i = 0; i < SYMBOLS.length; i++) {
            if (SYMBOLS[i].equals(symbol)) {
                return i;
            }
        }
        return -1;
        
    }
}
