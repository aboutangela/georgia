/**
  Test MazeSolver class.

  For v0, testing the base cases as stated in README.
 */

public class UserOfMazeSolver {
  private static  Displayer displayer;

  public static void main(String[] commandLine)
     throws java.io.FileNotFoundException {
      System.out.println();

      Maze maze = new Maze( commandLine[0]
                          , Integer.parseInt( commandLine[1])
                          , Integer.parseInt( commandLine[2])
                          );
      System.out.println( maze + System.lineSeparator());

      displayer = new Displayer( Integer.parseInt( commandLine[3]));



      System.out.println(MazeSolver.solveMaze(maze));
      
  }
}
