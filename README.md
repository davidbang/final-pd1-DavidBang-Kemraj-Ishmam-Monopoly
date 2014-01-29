final-pd1-DavidBang-Kemraj-Ishmam-Monopoly
===================================================
Please Look at both of our projects, the Connect 4 project functions while the Monopoly one does not.



Connect Four, is played on a 7x6 grid, where the goal is to get four pieces in a row. The files for the game are housed in the Connect4 folder, and offer two ways to play. By compiling and running the file Gui.java, one can play in a GUI with JButtons as the tokens and red and black pieces. The other option is to compile and run the Driver.java  file, which permits playing directly in the terminal, with 'X' and 'O' as players one and two respectively. (please note that you must uncomment the PlayGame, board2String, and Move methods in ConnectFourBoard.java in order to play the game in terminal, but this will be not necessary for a game in Gui)

Regardless of which interface is chose, no functionality is lost, and the game remains just as fun and challenging. However, there are a few extra features in the GUI. When running the GUI, you will be prompted for Player 1's name, allowing for easier reference and the same for player 2. Should you decide that you do not want to play, pressing the cancel button will close the program. Once the game has started, should you for any reason want to reset the board prior to completing a match, the new game button in the upper left hand corner will do just that. Player 1 will have red tokens, and player 2 will have black tokens, player 1 will start first. To actually play Connect 4 in GUI and place your tokens in certain columns, you will press any button in a certain column of buttons. By pressing any button in the column you which to place you token, your token will automatically be place on the lowest empty slot in that column.

Also, after a player has won the game, you can choose to play again (with the same players) or not (which will automatically exit the game). In the case of a draw, when the board is full and no one has yet won, you will be asked if you want to play again or if you do not want to (if so you will exit the game). To win the game, a player must either make a diagonal, horizontal, or vertical connect 4. A message congratulating the winner will pop up after the game.

At the moment there is no AI, thus only player vs. player is available, and there may be a few glitches in the GUI that were not caught during beta testing. To exit the game at any time, press the red X in the upper right corner of the GUI interface or any of the pop up messages.

Thank you for playing, and enjoy!!





Monopoly Context:


Swag.java was intended to be our interface file or GUI, but it does not compile and we cannot figure out why.
Look at GuiSample for a simple image of how the interface would have looked (thought it does not work beyond being an image).

We planned to make this monopoly game as close to the original board game,
but we received a lot of errors and more errors when we tried to correct it,

How we planned it to work:
A 4 player game with up to 4 human players and bot players to make up the players if there is a lack of 4 players,
A player will roll a 2 sided die and then continue to go around the board, buying properties and experiencing events that will result in a loss or gain of money, or sporadic displacements.
A player will win the game when the other players run out of money.

Rules are:
Pass Go, then collect $200
If you land in Jail, you are stuck in jail into you get identical dice rolls
If you land on a property you can buy it if it is not owned and you can build houses if you have money,
If you land on an owned property, you must pay the owner the respective amount due.
Community Chest and Chance Cards are drawn once you land on the correct event square.
Houses can be mortgaged for a loan, but your debt cannot pass your net worth or you are out of the game.

The winner is the last survivor with money.
