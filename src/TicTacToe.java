import java.util.Scanner;

public class TicTacToe {
    static Scanner scanner = new Scanner(System.in);
    static int player = 1;
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
        while (checkSlots()) {
            printPlayingfield();
            playTurnMessage();
        }

        boolean flag = getAndValidatePlayerInput();

        System.out.println("Flag Status == " + flag);

    }


    public static boolean checkSlots() {
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
    }

    public static void playTurnMessage() {
        // How to play, call player whose turn it is and ask for input
        System.out.println("\nValid formats: A1 X or b3 o");
        System.out.println("It's player " + player + "'s turn!");
        System.out.println("Enter: ");
    }

    public static boolean getAndValidatePlayerInput() {
        playerInput = scanner.nextLine();

        if (!playerInput.toUpperCase().matches(regex)) {
            // flag = false;
            return false;
        }
        return true;
    }

    public static void gameOver() {
        // After game finishes / all slots occupied
        System.out.println("--------------");
        System.out.println("Game Over! \ud83d\ude38");
        System.out.println("--------------");
    }
}
