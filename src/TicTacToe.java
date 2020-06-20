import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);

    // Number of player whose turn it is
    static int player = 1;

    // If the player enters an invalid move this becomes false and the wrongTurn section will be activated
    // static boolean flag = true;

    // In this string the input from the players are stored and passed to the array
    static String playerInput;

    /* Here are all characters and the exact order that the player is allowed to input.
       While the player can enter either upper- or lowercase characters the code casts it uppercase.
    */
    static String regex = "[ABC][1-3]\\s[XO]";

    // These variables represent the areas or slots the player can manipulate by an input.
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

        while (checkSots()) {
            printPlayingfield();
            playTurnMessage();
        }

        boolean flag = getAndValidatePlayerInput();


        System.out.println("Flag Status == " + flag);

    } // main


    public static boolean checkSots() {
        /* The game runs in a while-loop, that is constantly checking if all slots are occupied,
           this means if the underscores have been replaced either by an X or O.
           As soon as all moves are made the game ends.
        */

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

        // This for-loop prints the whole playing field before every turn.
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

   // public static void wrongInput() {
    //}

    public static void gameOver() {
        // After game finishes / all slots occupied
        System.out.println("--------------");
        System.out.println("Game Over! \ud83d\ude38");
        System.out.println("--------------");
    }

} //class
