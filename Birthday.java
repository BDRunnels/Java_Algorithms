import java.util.ArrayList;
import java.util.List;

public class Birthday {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(5);
        input.add(1);
        input.add(3);
        input.add(4);
        input.add(4);
        input.add(3);
        input.add(5);
        input.add(1);
        input.add(1);
        input.add(2);
        input.add(1);
        input.add(4);
        input.add(1);
        input.add(3);
        input.add(3);
        input.add(4);
        input.add(2);
        input.add(1);
        System.out.println(input);

        birthday(input, 18, 7);

    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        // need to find segments of `s`, where length == m and d == s[i] + s[i];
            // ex s = [2,2,1,3,2]
            // d = 4
            // m = 2
            // ANSWER [2,2] & [1,3] --> Both equal 4 (d) and have length 2 (m).
            int count = 0;
            int sum = 0;

            // i <= s.size() - m ---> important so that we are always looking at ENOUGH ELEMENTS (size is 18, m is 7), as we will be traversing 7 elements further than `i`, we need to ONLY GO UP TO THAT starting point. If we don't have size() - m, we will have an IndexOutOfBoundsException as `j` increases in the nested loop.
            for (int i = 0; i <= s.size() - m; i++) {

                // j < i+m ---> IMPORTANT so that we are taking the current index `i` and adding it to `m`. Since j will be incrementing by 1 each time and we need to move `m` elements through the List `s`, it will move `i` + `m` elements forward.
                for (int j = i; j < i + m; j++) {
                    System.out.println("j = " + j);
                    System.out.println("i + m = " + (i+m));
                    sum += s.get(j);
                }
                
                if (sum == d) count++;
                sum = 0;
            }
            System.out.println(count);
            return count;
        }
}
