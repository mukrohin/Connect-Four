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
