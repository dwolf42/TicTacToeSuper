    __ __            __                              _                    __                               
   / //_/  ____ _   / /_    _____  ____ _   _  __   (_)   _____          / /   __  __ _   __  ____    _____
  / ,<    / __ `/  / __ \  / ___/ / __ `/  | |/_/  / /   / ___/         / /   / / / /| | / / / __ \  / ___/
 / /| |  / /_/ /  / /_/ / / /    / /_/ /  _>  <   / /   (__  )         / /___/ /_/ / | |/ / / /_/ / (__  ) 
/_/ |_|  \__,_/  /_.___/ /_/     \__,_/  /_/|_|  /_/   /____/         /_____/\__,_/  |___/  \____/ /____/  
                                                                                                           
                                                                           
TicTacToeSuper


1. How to run the game:

-> Step 1 - Make sure the lastest version of Java is installed. Free download: https://www.java.com/

-> Step 2 - Just hit the TicTacToeSuper.exe ;-)


2. How to play:
This is how the playing field looks like:

>--1-2-3-<
A| _ _ _ |
B| _ _ _ |    
C| _ _ _ |
>--------<

First choose a row, they come in flavors of A, B and C Now select your favorite column 1, 2 or 3. Hit the space-bar. 
Input your symbol. Are you more of an X person, or the O person?
Push Enter-key - that's it.

Valid moves look like:
A1 O
B3 X
C2 X
etc.

Invalid moves are every input different from the valid pattern e.g.:
A 1 X
B O1
H2 o

Note: Game does not check if a slot has already been occupied by a players' symbol.
Note: Game does not check if one, or the other player has won the game nor does it check for a draw.

There is also an easter-egg implemented. Do you think you can catch it? :-)


3. How I wrote 3TSuper:

While following a tutorial track on Hyperskill.org to develop a simple TicTacToe game written in Java I've started to push the basic tutorial a byte further than originally intended by JetBrains.

This version got the suffix 'Super' because I put most code parts into methods in order to study how they actually work and can be utilized.

My tweaked the original playing field visual appearance and stored inside a 2D array, instead of just using pint-methods to display it. For better orientation I named the rows A, B, C as well as the columns 1, 2, 3.

Basic playing field:

---------
| _ _ _ |
| _ _ _ |    
| _ _ _ |
---------

My modified version:

>--1-2-3-<
A| _ _ _ |
B| _ _ _ |    
C| _ _ _ |
>--------<

Now the game will tell which players turn it is, prints the whole playing field before every turn, tells you how to play, and notifies you about an invalid move made. To match every move I've added a Regex to the code, so only valid moves will be accepted by the game.

Enough said, let's jump right into the game!
Ejoy ;-)

Kabraxis

get in touch with me: https://github.com/dwolf42

Credits:
Icons made by https://www.flaticon.com/authors/those-icons
