import java.util.Scanner;

/**
 * Parse url
 * You want to hack a website now. First, get all the available parameters that you can find in the URL. Then print
 * them in the "key : value" format. If a parameter doesn't have value, print "not found".
 *
 * If you find the password (parameter pass), you should print its value after all parameters once again, but with a
 * key password. If a URL does not contain parameter pass, do not print anything after the listed parameters. However,
 * if pass parameter is present, its value cannot be empty.
 *
 * Note: the order of parameters should be the same as in the URL.
 * Advice: Check examples for better understanding and carefully learn the structure of the URL.
 */

class Main {

    public static void parsedURL(String url) {
        String[] urlArray = url.split("\\?");
        String urlString = urlArray[1];
        String[] parameter = urlString.split("&");
        StringBuilder pass = new StringBuilder();
        for (String temp : parameter) {
            String[] tempArray = temp.split("=");
            if (tempArray.length == 1) {
                System.out.println(tempArray[0] + " : " + "not found");
            } else {
                System.out.println(tempArray[0] + " : " + tempArray[1]);
            }
            if ("pass".equals(tempArray[0])) {
                pass.append(tempArray[1]);
            }
        }
        if (urlString.contains("pass")) {
            System.out.println("password : " + pass);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        parsedURL(url);
    }
}