public class ReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(5));
    }
    public static String makeReadable(int seconds) {
        // Do something
        int hour = 00;
        int minute = 00;
        int second = 00;
        
        
        System.out.println(hour);
        if (seconds >= 3600) {
          hour = seconds / 3600;
          seconds -= (hour * 3600);
        }
        if (seconds >= 60) {
          minute = seconds / 60;
          seconds -= (minute * 60);
        }
        second = seconds < 60 ? seconds : 00;
        
        return String.format("%02d:%02d:%02d", hour, minute, second);
      }
}
