public class SB {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        string.append(false);
        System.out.println(string);
        string.append("Hi");
        System.out.println(string);
        System.out.println(Boolean.toString(true));

        string.setLength(0);
        string.append("Hello World!");
        System.out.println(string);
        string.trimToSize();
        System.out.println(string);

        String hi = "   Hello World! ";
        System.out.println("HI: " + hi.trim());

        StringBuilder sb = new StringBuilder();
        sb.append("Age: ").append(25).append(", ").append("Height: ").append(5.9);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        System.out.println(sb.toString().toCharArray());
        System.out.println(sb.reverse());

        for (char c: sb.toString().toCharArray()) {
            System.out.print(c + " ");
            if (c == sb.charAt(sb.length() -1)) {
                System.out.println("\n\tFinished!");
            }
        }
    }
}
