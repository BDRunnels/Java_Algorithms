import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a number to print Hello World n number of times:");
        int next = scanner.nextInt();

        for (int i = 0; i < next; i++) {
            System.out.println("Hello World!");
        }
    }
}
