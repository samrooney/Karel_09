import edu.fcps.karel2.Display;

/**
*  <Describe what the Racer class does>
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

public class Racer extends Athlete {

	public Racer(int y) {
		super(1, y, Display.EAST, Display.INFINITY);
	}
	
	public void jumpRight() {
		turnLeft();
		move();
		turnRight();
		move();
		turnRight();
		move();
		turnLeft();
	}
	
	public void jumpLeft() {
		turnRight();
		move();
		turnLeft();
		move();
		turnLeft();
		move();
		turnRight();
	}
	
	public void sprint(int n) {
		for (int k = 1; k<=n; k++) {
			move();
		}
	}
	
	public void put(int n) {
		for (int i = 0; i<n; i++) {
			putBeeper();
		}
	}
	
	public void pick(int n) {
		for (int i = 0; i<n; i++){
			pickBeeper();
		}
	}
	
	/**
	 * Racers shuttle by moving forward, jumping any hurdles along the way, and collecting
	 * the required number of beepers.  Racers then return to their starting position and
	 * deposit the collected beepers.  Finally, Racers face East to complete the shuttle.
	 * 
	 * @param spaces
	 * @param beepers
	 */
	public void shuttle(int spaces, int beepers) {
		move();
		jumpRight();
		sprint(spaces-2);
		pick(beepers);
		turnAround();
		sprint(spaces-2);
		jumpLeft();
		move();
		put(beepers);
		turnAround();
	}

}
