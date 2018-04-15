/**
  Solve the Maze problem

  For v0, start with base cases:
    if on treasure, return true
    if on wall, return false
 */


public class MazeSolver {
      private Displayer displayer;

    public MazeSolver( Displayer displayer) {
        this.displayer = displayer;
    }
     private static int[] directions = new int[]{Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};


public static boolean solveMaze( Maze maze) {
  //check base cases

  //if on wall
    if (maze.explorerIsOnA() == maze.WALL)
      return false;
	//if on treasure
    else if( maze.explorerIsOnA() == maze.TREASURE)
	   return true;
  Maze snapshot = new Maze(maze);
	//else, on stepping stone
	//For every legal neighbor of explorer
	for(int direction: directions){
	    // Replace original stepping stone with a wall
	    maze.dropA(maze.WALL);
	    //Invoke recursive abstraction
	    //When I am asked to solve a maze, given a maze, the recursive abstraction can solve a maze with one fewer stepping stones by making the next legal move.
      maze.go(direction);
      if( solveMaze(maze))
        return true;
	    //Recover original stepping stone
      maze = new Maze(snapshot);
	   }       
	return false;
	}

}
