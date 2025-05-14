import java.util.Scanner;

public class MiniShell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShellCommandHandler handler = new ShellCommandHandler();

        System.out.println("Welcome to MiniShell! Type 'help' for a list of commands.");

        while (true) {
            System.out.print(handler.getCurrentDirectory().getAbsolutePath() + " > ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                continue;
            }

            String[] parts = input.split(" ", 2);
            String command = parts[0];
            String argument = parts.length > 1 ? parts[1] : null;

            switch (command) {
                case "pwd":
                    handler.printWorkingDirectory();
                    break;
                case "ls":
                    handler.listDirectory();
                    break;
                case "cd":
                    handler.changeDirectory(argument);
                    break;
                case "mkdir":
                    handler.makeDirectory(argument);
                    break;
                case "touch":
                    handler.createFile(argument);
                    break;
                case "help":
                    handler.printHelp();
                    break;
                case "exit":
                    System.out.println("Exiting shell.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command: " + command);
                    break;
            }
        }
    }
}
