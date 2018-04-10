# georgia

## personnel
Grace Feeley, Angela Li

## statement of problem
Return the boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from start point to existing treasure."

## recursive abstraction
When I am asked to solve a maze, given a maze, the recursive abstraction can solve a maze with one fewer stepping stone by making the next legal move.

>>Solving a maze means to return the boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from start point to existing treasure"

## base case
>When the explorer finds the treasure in the maze (the boolean statement is true)
>If the maze isn't navigable (the boolean statement is false)

## english or pseudocode of the algorithm
Start at a point (x,y)
Check for base case
Look for the next legal stepping stone
>If there is no stepping stone or an obstruction, backtrack to the start
>Else, move forward and invoke the recursive abstraction
Return the boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from start point to existing treasure"

## class(es) with fields and methods

## version*n* wishlist 
