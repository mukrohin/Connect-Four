A file through which we can communicate.

Rohin:
I created a grid class that I think will work better for the game stand then what you had.
Right now you should probably work on identifying win condition in my new grid.

Allen - 5/15/2017
-----------------
v0.02
 - Added new method checkForWinner in Grid.java. This method currently checks for vertical, horizontal, and ascending diagonal winners.    Descending digonal yet to be implemented.
 - Method being tested in the ConnectFour.java
 - I also created a string version of Grid using x's and o's with [ ] to construct the board if we want to go down that route. That file is called Grid_string
 - In my allen branch I have the updated Grid.java, ConnectFour.java, and Grid_string.java 

Allen - 5/16/2017
-----------------
v0.03
- Descending diagonal has been implemented to the checkForWinner method
- Diagonal win conditions have not been completely tested yet
- Assuming my method works correctly, we should move on to finding a way for players to alternate turns and implementing the scanner

Rohin - 05/17/2017
- In the betterGrid branch, the game is working
- The launcher is ConnectFour.java
- The grid creator with win checking implemented is Grid.java
- You should be able to play a game of Connect Four with these two programs.
- If you see anything to work on in these codes, do it.
- Otherwise, we should star working on the GUI.

Allen - 5/17
----------------
- I am adding a score keeper and a rematch option. I also added column numbers to the grid in case we don't end up creating a GUI. 
- I haven't added the changes on here yet because I haven't finished
- I haven't done any work on the GUI 

Rohin - 05/19/2017
- I can't make the GUI today because I cannot download e(fx)clipse, so I will have to work on this at home.
- We are ready to merge the betterArray branch with master, so I've done that.
- From now on, all the work on the game will be completed directly in master.

Allen - 5/23
-------
v0.04
- Added score at the end of each game
- Added a rematch open at the end of each game
- Added new method called reset that resets the board for a rematch
- Added column labels

Rohin - 05/30/2017

- I made a launcher GUI.
- I tried to make a game GUI in JavaFX, but I couldn't figure it out.
- We will just have to use the console GUI.
- It isn't the best, but it will work.
