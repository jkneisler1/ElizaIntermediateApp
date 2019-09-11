import java.util.Scanner;

/**
 * Replacements:
 ***************
 *      replace i with you
 *      replace me with you
 *      replace my with your
 *      replace am with are
 */

public class ElizaIntermediateApp {
    public static void main(String[] args) {
        String greeting = "Good day.  What is your problem?  ";
        String userPrompt = "Enter your response here or enter Q to quit: ";
        boolean sessionActive = true;
        Scanner key = new Scanner(System.in);
        String userQu;
        String[] userReplace;
        StringBuilder userResp = new StringBuilder();

        System.out.print(greeting);

        while (sessionActive) {
            System.out.println(userPrompt);
            userQu = key.nextLine();

            if (userQu.equalsIgnoreCase("q")) {
                sessionActive = false;
                System.out.println(">>> END");
            } else {
                userReplace = userQu.split(" ");            // split the user's question into tokens
                for (String token : userReplace) {
                    if (token.equalsIgnoreCase("i")) {
                        userResp.append("you ");
                    }
                    else if (token.equalsIgnoreCase("me")) {
                        userResp.append("you ");
                    }
                    else if (token.equalsIgnoreCase("my")) {
                        userResp.append("your ");
                    }
                    else if (token.equalsIgnoreCase("am")) {
                        userResp.append("are ");
                    }
                    else {
                        userResp.append(token + " ");
                    }
                }
                System.out.println(userResp.toString());
                userResp.delete(0, userResp.length());
            }
        }
    }

}
