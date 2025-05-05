import java.util.Scanner;

public class ParseTheTweet {
    public static void main(String[] args) {

        String tweet;

        Scanner keyboard = new Scanner(System.in);

        String type = "Empty";
        String detail = "Empty";
        String location = "Empty";
        String latitude = "Empty";
        String longitude = "Empty";

        int start;
        int finish;

        System.out.println("Input your tweet below: ");
        tweet = keyboard.nextLine();

        for (int i = 1; i < 6; i ++) {
            start = tweet.indexOf("#") + 4;
            finish = tweet.indexOf(";");
            switch (i) {
                case 1 -> type = tweet.substring(start, finish);
                case 2 -> detail = tweet.substring(start, finish);
                case 3 -> location = tweet.substring(start, finish);
                case 4 -> latitude = tweet.substring(start, finish);
                case 5 -> longitude = tweet.substring(start, finish);
                default -> System.out.println("Error");

            }
            tweet = tweet.substring(finish + 1);
        }

        System.out.println("Type: \t\t" + type.toUpperCase());
        System.out.println("Detail: \t" + detail.replace(",", "-"));
        System.out.println("Location: \t" + location.replace(",", "-"));
        System.out.println("Latitude: \t" + latitude);
        System.out.println("Longitude: \t" + longitude);

    }
}
