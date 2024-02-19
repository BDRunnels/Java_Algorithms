import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ArcadeGame {
    private static Object[] array;

    public static void main(String[] args) {
        List<Integer> hi = new ArrayList<>();
        HashSet<Integer> yo = new HashSet<>();
        hi.add(100);
        hi.add(100);
        hi.add(50);
        hi.add(40);
        hi.add(40);
        hi.add(20);
        hi.add(10);

        System.out.println(hi);
        yo.addAll(hi);
        List<Integer> answer = new ArrayList<>(yo);
        Collections.sort(answer);
        Collections.reverse(answer);
        System.out.println(answer);
        
    }

    // Steps 
        // Player with highest score is ranked 1.
        // Players who have equal scores receive the same ranking number. and the next players receive the immediately following number.
    
    // EX:
        // ranked = [100,90,90,80]
        // player = [70,80,105];

        // The players will have ranks 1,2,2,3 respectively. If the players scores are 70,80,105, their rankings after each game are 4th, 3rd, and 1st, return [4,3,1]

    // Parameters : int ranked[n]: current leaderboard
    //              int player[m]: players scores

    // RETURNS : int[m] the players rank after each new score.
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> players) {
        // Want to:
            // iterate through ranked list, and find the value where the players score is less than previous, but greater than next.
                // if players is less than last item, it will be
        HashSet<Integer> set = new HashSet<>();
        set.addAll(ranked);
        
        System.out.println();
        List<Integer> answer = List.copyOf(set);
        answer.sort(Comparator.naturalOrder());
        
        return answer;
    }

    public static List<Integer> climbingLeaderboard1(List<Integer> ranked, List<Integer> player) {
        // Write your code here
            HashSet<Integer> set = new HashSet<>();
            set.addAll(ranked);
            
            List<Integer> sortedSet = new ArrayList<>(set);
            Collections.sort(sortedSet);
            Collections.reverse(sortedSet);
            
            List<Integer> answer = new ArrayList<>();
            
            int i = 0; // Index for ranked list
            int j = 0; // Index for player list
    
            while (j < player.size()) {
            if (i < sortedSet.size() && player.get(j) < sortedSet.get(i)) {
                // If player's score is less than the current rank in the ranked list
                answer.add(i + 2); // Rank increases by 1, and ranks are 1-indexed
                j++;
            } else if (i >= sortedSet.size()) {
                // If we have reached the end of the ranked list
                answer.add(sortedSet.size() + 1);
                j++;
            } else {
                // Move to the next rank in the ranked list
                i++;
            }
            
        }
        return answer;
    }
}
