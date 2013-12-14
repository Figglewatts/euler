package figglewatts.euler.problems.oneToFifty;

import figglewatts.euler.BaseProblem;

/**
 * @author Figglewatts
 */
public class Problem1 extends BaseProblem {

	public Problem1() { this.name = "Multiples of 3 and 5"; this.number = 1; }

	@Override
	public void Execute() {
		System.out.println("Beginning computation.");
		int result = 0;
		for (int i = 1; i < 1000; i++) {
			if ((i % 15) == 0) {
				// it's divisible by both 3 and 5
				result += i; // add it to the result integer
				continue; // skip the other checks
			}
			else if ((i % 5) == 0) {
				// it's divisible by 5 only
				result += i;
				continue;
			}
			else if ((i % 3) == 0) {
				// it's only divisible by 3
				result += i;
				continue;
			}
		}
		System.out.println("Sum of multiples of 3 and 5 where multiple > 1 and < 1000 is equal to:");
		System.out.println(result);
	}
}
