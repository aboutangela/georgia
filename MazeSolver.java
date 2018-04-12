/**
  Solve the Maze problem

  For v0, start with base cases:
    if on treasure, return true
    if on wall, return false
 */


public class MazeSolver {
     ArrayList< Maze> solutions;
     Maze inProgress;

    public MazeSolver(String sourcefilename, int explorerRank, int explorerFile) {
            
        inProgress = new Maze(String sourcefilename, int explorerRank, int explorerFile);
        solveMaze(); 
    }

public boolean solveMaze() {
     //Explorer starts on a point

     //Check base cases
    if (inProgress.explorerIsOnA().equals("WALL");
	return false;

	//If on treasure, return true -- don't know how to do yet

  

	//Else, on stepping stone

	//For every legal neighbor of explorer

	int[] directions = new int{1,2,4.8};
	

	for(int a: directions){
	    
	    // Replace original stepping stone with a wall
	    Maze backUp = new Maze(inProgress);

	    inProgress.dropA(2);

	    //Invoke recursive abstraction
	    //When I am asked to solve a maze, given a maze, the recursive abstraction can solve a maze with one fewer stepping stones by making the next legal move.
	    if(inProgress.go(a) == null) break;
	    else inProgress.go(a);
	    solveMaze;
	    //Recover original stepping stone

	    backUp.dropA(2);
	}
	
	    
	return false;
	
    }

}
