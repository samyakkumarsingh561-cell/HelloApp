/**
 * HelloApp - UC4
 * A simple Java application that greets multiple users by name if
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 *
 * Usage: java HelloAppUC4 [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!"
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Developer Name
 * @version 4.0
 * @since UC1
 */

public class HelloAppUC4 {
    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            // Default greeting if no names are provided
            name = "World";
        } else {
            // Build a comma-separated list of names
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        }

        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }
}
