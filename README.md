# georgia

## personnel
Grace Feeley, Angela Li

## statement of problem
Return the boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from start point to existing treasure."

## recursive abstraction
When I am asked to solve a maze, given a maze, the recursive abstraction can solve a maze with one fewer stepping stones by making the next legal move.


## base case
>When the explorer finds the treasure in the maze (the boolean statement is true)
>If the maze isn't navigable (the boolean statement is false)

## english or pseudocode of the algorithm
<pre>
<code>
Explorer starts on a point

Check base cases

  If on treaure, return true
  
  If on wall, return false
  
  Else, on stepping stone
  
For every legal neighbor of explorer

  Replace original stepping stone with a wall

  Invoke recursive absraction 
  
  Recover original stepping stone

Return False
</code>
</pre>

## class(es) with fields and methods

## version*n* wishlist 
