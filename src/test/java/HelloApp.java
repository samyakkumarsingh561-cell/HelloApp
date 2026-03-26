/**
 * HelloApp - UC7
 * A simple Java application that greets multiple users by name
 * using the String.join() method, or defaults to greeting "World".
 *
 * Usage: java HelloAppUC7 [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!".
 * - If no names are provided, it will display "Hello, World!".
 *
 * @author Developer Name
 * @version 7.0
 * @since UC1
 */

public class HelloApp {
    public static void main(String[] args) {
        String names;

        if (args.length == 0) {
            // Default greeting if no names are provided
            names = "World";
        } else {
            // Use String.join() to concatenate names with commas
            names = String.join(", ", args);
        }

        // Print the greeting
        System.out.println("Hello, " + names + "!");
    }
}
