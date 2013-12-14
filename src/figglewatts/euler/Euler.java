package figglewatts.euler;

import java.util.ArrayList;
import java.util.List;

import figglewatts.euler.problems.oneToFifty.Problem1;

/**
 * @author Figglewatts
 */
public class Euler {
	private static List<BaseProblem> problemList = new ArrayList<BaseProblem>();
	
	public static void main(String[] args) {
		PopulateList();
		SolveProblem(1);
	}
	
	private static void PopulateList() {
		problemList.add(new Problem1());
	}
	
	public static void SolveProblem(int problemNumber) {
		problemList.get(problemNumber-1).Execute();
		
	}
}
