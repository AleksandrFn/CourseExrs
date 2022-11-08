import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "51351351341313";
        System.out.println(Arrays.toString(splitStringTwoParts(str)));
    }

    public static String[] splitStringTwoParts(String str) {
        String[] parts = new String[2];
        if (str.length() % 2 == 0) {
            parts[0] = str.substring(0, str.length() / 2);
            parts[1] = str.substring(str.length() / 2);
        } else {
            parts[0] = str.substring(0, str.length() / 2);
            parts[1] = str.substring(str.length() / 2 + 1);
        }

        return parts;
    }
}