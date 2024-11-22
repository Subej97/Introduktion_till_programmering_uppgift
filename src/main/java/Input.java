import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Counter counter = new Counter();

        String inputLine;
        while (true) {
            System.out.print("Enter a line of text (type 'stop' to finish): ");
            inputLine = scanner.nextLine();

            if (inputLine.equalsIgnoreCase("stop")) {
                break; // Exit the loop if "stop" is entered
            }

            counter.addLine(inputLine);
        }

        counter.printResults();

        scanner.close();
    }
}
