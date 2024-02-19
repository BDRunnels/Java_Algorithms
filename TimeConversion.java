public class TimeConversion {
    public static void main(String[] args) {
        String result = timeConversion("04:05:45PM");
        System.out.println(result);
    }

    public static String timeConversion(String s) {
        // Write your code here
            int hour = Integer.parseInt(s.substring(0, 2));
            int min = Integer.parseInt(s.substring(3, 5));
            int sec = Integer.parseInt(s.substring(6, 8));
            
            String suffix = s.substring(8);
            System.out.println(hour);
            hour %= 12;
            System.out.println(hour);
            if (suffix.equals("PM")) {
                hour += 12;
            }
            
            return String.format("%02d:%02d:%02d", hour, min, sec);
        }
}
