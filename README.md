# georgia

## personnel
Grace Feeley, Angela Li

## statement of problem
Return the boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from start point to existing treasure."

## recursive abstraction
When I am asked to solve a maze, given a maze, the recursive abstraction can solve a maze with one fewer stepping stones by making the next legal move.


## base case
>If on treasure, return true
>If on wall, return false

## english or pseudocode of the algorithm
<pre>
<code>
Explorer starts on a point

Check base cases

  If on treasure, return true

  If on wall, return false

  Else, on stepping stone

For every legal neighbor of explorer

  Replace original stepping stone with a wall

  Invoke recursive abstraction

  Recover original stepping stone

Return False
</code>
</pre>

## class(es) with fields and methods
<pre>
<code>
public class MazeSolver(){
Maze inProgress;
public MazeSolver(String sourcefilename, int explorerRank, int explorerFile);
private boolean solveMaze();
}
</code>
</pre>



## version*n* wishlist

## known bugs
>Cannot navigate a non-only tresure map
>Cannot record all solutions
>Displayer not utilized yet
