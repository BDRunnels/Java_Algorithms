import java.util.Arrays;


// 2 players
    // Each player starts with 3 coins
    // Each player has secret option of 'share' or 'steal' per round.
    // If player shares -> they lose 1, other player gains 3
    // If player steals -> they lose 0, and gain 3 from other player
    // Determine coins of each player for each round, defined as an array of String.

public class CoinCoOp {
    public static void main(String[] args) {
        String[] input1 = {"share"};
        String[] input2 = {"share"};

        int[] a1 = getCoinBalances(input1, input2);
        System.out.println(Arrays.toString(a1));

        String[] input3 = {"steal"};
        String[] input4 = {"share"};

        int[] a2 = getCoinBalances(input3, input4);
        System.out.println(Arrays.toString(a2));

        String[] input5 = {"steal"};
        String[] input6 = {"steal"};

        int[] a3 = getCoinBalances(input5, input6);
        System.out.println(Arrays.toString(a3));

        String[] input7 = {"share", "share", "share"};
        String[] input8 = {"steal", "share", "steal"};

        int[] a4 = getCoinBalances(input7, input8);
        System.out.println(Arrays.toString(a4));
    }

    private static int[] getCoinBalances(String[] p1, String[] p2) {
        int p1Coins = 3;
        int p2Coins = 3;

        for (int i = 0; i < p1.length; i++) {
            if (p1[i].equals("share") && p2[i].equals("share")) {
                p1Coins += 2;
                p2Coins += 2;
            } else if (p1[i].equals("share") && !p2[i].equals("share")) {
                p1Coins--;
                p2Coins += 3;
            } else if (!p1[i].equals("share") && p2[i].equals("share")) {
                p1Coins += 3;
                p2Coins--;
            }

        }

        return new int[]{p1Coins, p2Coins};
    }

        // GPT Answer. WRONG.
    // public static int[] getCoinBalances(String[] actions1, String[] actions2) {
    //     int balance1 = 3;  // Initial balance for player 1
    //     int balance2 = 3;  // Initial balance for player 2
        
    //     for (int i = 0; i < actions1.length; i++) {
    //         if (actions1[i].equals("share")) {
    //             balance1--;
    //             balance2 += 3;
    //         } else if (actions1[i].equals("steal")) {
    //             balance2 += 3;
    //         }
            
    //         if (actions2[i].equals("share")) {
    //             balance2--;
    //             balance1 += 3;
    //         } else if (actions2[i].equals("steal")) {
    //             balance1 += 3;
    //         }
    //     }
        
    //     int[] balances = {balance1, balance2};
    //     return balances;
    // }
}
