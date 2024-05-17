import java.util.Scanner;
import java.util.Stack;

public class DriverS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Game> stack = new Stack<>();

        boolean continueLoop = true;
        while (continueLoop) {
            print("\nChoose an option:");
            print("1. Add a game to the stack");
            print("2. Pop a game from the stack");
            print("3. Peek at the top game");
            print("4. Check if the stack is empty");
            print("5. Get the size of the stack");
            print("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the game: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter the price of the game: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    Game game = new Game(name, price);
                    stack.push(game);
                    print("Game added to the stack: " + game.toString());
                    print("");
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        print("Stack is empty");
                    } else {
                        Game poppedGame = stack.pop();
                        print("Popped game: " + poppedGame.toString());
                    }
                    print("");
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        print("Stack is empty");
                    } else {
                        Game topGame = stack.peek();
                        print("Top game: " + topGame.toString());
                    }
                    print("");
                    break;
                case 4:
                    print("Stack is empty? " + stack.isEmpty());
                    print("");
                    break;
                case 5:
                    print("Size of the stack: " + stack.size());
                    print("");
                    break;
                case 6:
                    continueLoop = false;
                    break;
                default:
                    print("Invalid choice");
            }
        }
    }
    public static void print(String s) {
        System.out.println(s);
    }
}