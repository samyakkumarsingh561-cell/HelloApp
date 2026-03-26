/**
 * HelloApp - UC6
 * Display "Hello" with Multiple Command-Line Arguments using substring
 * to Remove Trailing Delimiter.
 *
 * Usage: java HelloAppUC6 [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!".
 * - If no names are provided, it will display "Hello, World!".
 *
 * @author Developer Name
 * @version 6.0
 * @since UC1
 */

public class HelloApp {
    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            // Default greeting if no names are provided
            name = "World";
        } else {
            // Build a comma-separated list of names with trailing delimiter
            StringBuilder nameBuilder = new StringBuilder();
            for (String arg : args) {
                nameBuilder.append(arg).append(", ");
            }

            // Remove the last ", " using substring
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }
}
