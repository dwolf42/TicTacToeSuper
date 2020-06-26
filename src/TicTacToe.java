import java.util.Scanner;
import java.util.regex.*;

public class TicTacToe {
    static Scanner scanner = new Scanner(System.in);

    static int player = playerSwitcher( 1);
    static String playerInput;
    static String regex = "[ABC][1-3]\\s[XO]";

    static char a1 = '_';
    static char a2 = '_';
    static char a3 = '_';

    static char b1 = '_';
    static char b2 = '_';
    static char b3 = '_';

    static char c1 = '_';
    static char c2 = '_';
    static char c3 = '_';



    public static void main(String[] args) {

   //    boolean flag = getAndValidatePlayerInput();

        while (checkSlots() == true) {
System.out.println("\nStep 2");
            printPlayingfield();
System.out.println("\nStep 4");
            playTurnMessage();
            if (getAndValidatePlayerInput() == false) {
                wrongInput();
            } else {

                if (player == 1) {
                    System.out.println("\nStep 6");
                    player = 2;
                } else {
                    player = 1;
                }
                columnCheck();

            }

        }
        gameOver();
    }


    public static boolean checkSlots() {
        System.out.println("\nStep 1");

        if ((a1 == '_') || (a2 == '_') || (a3 == '_')
                || (b1 == '_') || (b2 == '_') || (b3 == '_')
                || (c1 == '_') || (c2 == '_') || (c3 == '_')) {
            return true;
        }
        return false;
    }

    public static void printPlayingfield() {
            /* This 2 dimensional array stores the basic look of the playing field, as well as the locations
               where moves can be placed and also stores the actual move as long as the game's running.

               ◜--1-2-3-◝
               A| _ _ _ |
               B| _ _ _ |    <-- The default playing field appearance. Corners are written in unicode.
               C| _ _ _ |
               ◟--------◞
             */
        char[][] ticSuper = {{'\u25DC', '-', '-', '1', '-', '2', '-', '3', '-', '\u25DD'},
                {'A', '|', ' ', a1, ' ', a2, ' ', a3, ' ', '|'},
                {'B', '|', ' ', b1, ' ', b2, ' ', b3, ' ', '|'},
                {'C', '|', ' ', c1, ' ', c2, ' ', c3, ' ', '|'},
                {'\u25DF', '-', '-', '-', '-', '-', '-', '-', '-', '\u25DE'},
        };

        for (int row = 0; row < 5; row++) {
            int column;
            for (column = 0; column < 9; column++) {
                System.out.print(ticSuper[row][column]);
            }
            System.out.print(ticSuper[row][column] + "\n");
        }
System.out.println("\nStep 3");
    }

    public static void playTurnMessage() {
System.out.println("\nStep 5");
        // How to play, call player whose turn it is and ask for input
        System.out.println("\nValid formats: A1 X or b3 o");
        System.out.println("It's player " + player + "'s turn!");
        System.out.println("Enter: ");
    }

    public static boolean getAndValidatePlayerInput() {
        playerInput = scanner.nextLine();

        if (!playerInput.toUpperCase().matches(regex)) {
            return false;
        }
        return true;
    }

    public static void wrongInput() {
        while (getAndValidatePlayerInput() == false) {
            System.out.println("\nInvalid move! Only enter letters A-C, followed by numbers 1-3, followed by a space, followed by letters X or O.");
            System.out.println("Please try again player " + player + ":");
            playerInput = scanner.nextLine();
            if (playerInput.toUpperCase().matches(regex)) {

                break;
            }
        }
    }

    public static int playerSwitcher(int a) {

        if (a == 1) {
            return 2;
        }
        return 1;
    }

    public static void columnCheck() {
        // column 'a' check
        if (playerInput.toLowerCase().charAt(0) == 'a') {
            // assigning value to the related position on the array
            if (playerInput.charAt(1) == '1') {
                a1 = playerInput.toUpperCase().charAt(3);
            } else if (playerInput.charAt(1) == '2') {
                a2 = playerInput.toUpperCase().charAt(3);
            } else if (playerInput.charAt(1) == '3') {
                a3 = playerInput.toUpperCase().charAt(3);
            }
        }

        // column 'b' check
        if (playerInput.toLowerCase().charAt(0) == 'b') {
            // assigning value to the related position on the array
            if (playerInput.charAt(1) == '1') {
                b1 = playerInput.toUpperCase().charAt(3);
            } else if (playerInput.charAt(1) == '2') {
                b2 = playerInput.toUpperCase().charAt(3);
            } else if (playerInput.charAt(1) == '3') {
                b3 = playerInput.toUpperCase().charAt(3);
            }
        }

        // column 'c' check
        if (playerInput.toLowerCase().charAt(0) == 'c') {
            // assigning value to the related position on the array
            if (playerInput.charAt(1) == '1') {
                c1 = playerInput.toUpperCase().charAt(3);
            } else if (playerInput.charAt(1) == '2') {
                c2 = playerInput.toUpperCase().charAt(3);
            } else if (playerInput.charAt(1) == '3') {
                c3 = playerInput.toUpperCase().charAt(3);
            }
        }
    }


    public static void gameOver() {
        // After game finishes / all slots occupied
        System.out.println("--------------");
        System.out.println("Game Over! \ud83d\ude38");
        System.out.println("--------------");
    }
}
