package figglewatts.euler.problems.oneToFifty;

import figglewatts.euler.BaseProblem;

/**
 * @author Figglewatts
 */
public class Problem2 extends BaseProblem {
	public Problem2() { this.name = "Even fibonacci numbers"; this.number = 2; }

	final double root5 = Math.sqrt(5); // the square root of 5
	final double phi = (1 + root5) / 2; // the mathematical constant Phi; AKA the golden ratio

	@Override
	public void Execute() {
		// the reason this works is because all Fibonacci numbers
		// with an index divisible by 3 are even.
		int result = 0;
		for (int i = 3; i <= 33; i+=3) { // i<=33 because 33 is the last index that does not exceed 4 million
			result += Fib(i);
		}
		System.out.println("The answer is: " + result);
	}
	
	/**
	 * Compute the fibonacci number at the index given.
	 * @see <a href="http://en.wikipedia.org/wiki/Fibonacci_number#Computation_by_rounding">Wikipedia: Fibonacci number - Computation by rounding</a>.
	 * @param index The fibonacci number to compute.
	 */
	private int Fib(int index) {
		return (int)Math.floor((Math.pow(phi, index)/root5)+0.5);
	}
}
