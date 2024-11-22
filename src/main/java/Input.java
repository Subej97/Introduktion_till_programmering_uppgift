import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Create an instance of TextCounter to handle counting
        Counter counter = new Counter();

        // Loop to read input until the user enters "stop"
        String inputLine;
        while (true) {
            System.out.print("Enter a line of text (type 'stop' to finish): ");
            inputLine = scanner.nextLine();

            // Check if the input is "stop"
            if (inputLine.equalsIgnoreCase("stop")) {
                break; // Exit the loop if "stop" is entered
            }

            // Pass the input line to the TextCounter object
            counter.addLine(inputLine);
        }

        // After loop ends, print the results
        counter.printResults();

        scanner.close();
    }
}
