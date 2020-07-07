**In the Super version of the game I'm trying to put every part of the code into methods
for studying reasons, therefore TicTacToeSuper is currently under development 
and unstable.**

While following a tutorial track on Hyperskill.org to develop a simple TicTacToeSuper game
written in Java I've started to push the basic tutorial a litte further.

I tuned the appearance of the playing field, implemented a 2d array to store both,
the values of the borders and lines of the playing field, as well as the actual
playing slots where player 1 and player 2 may place their symbols.

Basic playing field:
```
---------
| _ _ _ |
| _ _ _ |    
| _ _ _ |
---------
```
My modified version:
```
◜--1-2-3-◝
A| _ _ _ |
B| _ _ _ |    
C| _ _ _ |
◟--------◞
```

Now the game will tell which players turn it is, prints the whole playing field before
every turn, tells you how to play, and notifies you about an invalid move made. 
To match every move I've added a Regex to the code, so only valid moves are accepted
by the game.

In order to make a valid move you have to enter the row A B C, followed by the columns
number 1 2 3, followed by a space, followed by either X or O:

Valid:
```
A1 O
B3 X
C2 X
etc.
```
Invalid:
```
A 1 X
B O1
Any other format as shown under valid.
```

**Note:** Games does not check if a slot has already been occupied by a symbol.


As I love video games I also added an actual Game Over screen to the end of the game
when every slot has been occupied by a player.

**Note:** Game does not check if one or the other player has won the game nor does
it check for a draw.




