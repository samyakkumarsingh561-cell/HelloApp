/**
 * HelloApp.java - A simple Java application that greets the user by name if
 * provided as a command-line argument, or defaults to greeting "World" if no name is
 * given. This demonstrates handling optional command-line arguments and
 * providing default values in Java.
 *
 * UC 1: Display "Hello World"
 * UC 2: Display User Name
 * UC 3: Provide Default Value
 *
 * Usage: java HelloApp [name]
 * - If a name is provided, it will display "Hello, [Name]!"
 * - If no name is provided, it will display "Hello, World!"
 *
 * @author Developer Name
 * @version 3.0
 * @since UC1
 */

public class HelloApp3 {
    public static void main(String[] args) {
        // Default name
        String name = "World";

        // Check if a name is provided as a command-line argument
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }

        System.out.println("Hello, " + name + "!");
    }
}

