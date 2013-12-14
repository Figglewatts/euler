package figglewatts.euler;

import java.util.ArrayList;
import java.util.List;

import figglewatts.euler.problems.oneToFifty.Problem1;
import figglewatts.euler.problems.oneToFifty.Problem2;

/**
 * @author Figglewatts
 */
public class Euler {
	private static List<BaseProblem> problemList = new ArrayList<BaseProblem>();
	
	public static void main(String[] args) {
		PopulateList();
		SolveProblem(2);
	}
	
	private static void PopulateList() {
		problemList.add(0, new Problem1());
		problemList.add(1, new Problem2());
	}
	
	public static void SolveProblem(int problemNumber) {
		BaseProblem problem = problemList.get(problemNumber-1);
		System.out.println("Now executing problem number " + problem.number + ": " + problem.name);
		problem.Execute();
	}
}
