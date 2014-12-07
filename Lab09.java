/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author <...>
 * @version <...>
 *
 */


      import edu.fcps.karel2.Display;
      import edu.fcps.karel2.Robot;  
      import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 
       String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/" + map + ".map");
		 Display.setSize(10, 10);
		 Display.setSpeed(10);
       
       Athlete Dooby = new Athlete(1, 1, Display.EAST, 0);
		 
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       
       for (int i = 1; i <= 7; i++) {
       int count = 0;
       while (Dooby.nextToABeeper())
      {
       Dooby.pickBeeper();
       count++;
      }
       Dooby.move();
       for (int k = 1; k <= count; count--)
      {
       Dooby.putBeeper();
      }
      Dooby.turnAround();
       if (Dooby.frontIsClear()) 
      {
       Dooby.move();
      }
       if (Dooby.frontIsClear()) 
      {
       Dooby.move();
      }
       Dooby.turnAround();
     }
       Dooby.turnAround();
     
  }
}