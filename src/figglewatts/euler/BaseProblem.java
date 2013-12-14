package figglewatts.euler;

/**
 * @author Figglewatts
 */
public abstract class BaseProblem {
	public String name; // the name of the problem
	public int number; // the problem's number
	
	public abstract void Execute(); // override this with the code that the problem executes to solve it
}
