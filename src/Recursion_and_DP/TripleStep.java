package Recursion_and_DP;

/*
*Question: A child is running up a staircase with n steps and can hop either 1 step, 2 steps ot 3 steps at a time.
* Implement a method to count how many possible ways the child can run up the stairs
* */

public class TripleStep {
    public int countWays(int n){
        if (n < 0){
            return 0;
        }else if (n == 0){
            return 1;
        }else {
            return countWays(n-1) + countWays(n-2) + countWays(n-3);
        }
    }

    public static void main(String[] args) {
        TripleStep steps = new TripleStep();
        System.out.println(steps.countWays(7));
    }
}
