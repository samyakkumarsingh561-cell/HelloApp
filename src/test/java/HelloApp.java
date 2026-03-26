/**
 * UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop
 * or Default Message.
 *
 * Usage: java HelloAppUC5 [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!".
 * - If no names are provided, it will display "Hello, World!".
 *
 * @author Developer Name
 * @version 5.0
 * @since UC1
 */

public class HelloApp {
    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            // Default greeting if no names are provided
            name = "World";
        } else {
            // Build a comma-separated list of names using enhanced for loop
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;
            for (String arg : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(arg);
                first = false;
            }
            name = nameBuilder.toString();
        }

        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }
}
