import java.util.Scanner; // Imports the Scanner class from the java.util package

public class BasicJavaFile {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = inputScanner.nextLine(); // Read a line of text from the user

        System.out.println("Hello, " + userName + "!");

        inputScanner.close(); // Close the scanner to release resources
    }
}
