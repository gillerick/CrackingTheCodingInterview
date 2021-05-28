package Recursion_and_DP;

/*
*Question: A child is running up a staircase with n steps and can hop either 1 step, 2 steps ot 3 steps at a time.
* Implement a method to count how many possible ways the child can run up the stairs
* */

import java.util.Arrays;

public class TripleStep {
    //Recursive solution
    public int countWays(int n){
        if (n < 0){
            return 0;
        }else if (n == 0){
            return 1;
        }else {
            return countWays(n-1) + countWays(n-2) + countWays(n-3);
        }
    }

    //Memoization solution
    public int _countWays(int n){
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return _countWays(n,memo);
    }

    public int _countWays(int n, int[] memo){
        if (n < 0){
            return 0;
        }else if (n == 0){
            return 1;
        }else if (memo[n] > -1) {
            return memo[n];
        }else{
            memo[n] = _countWays(n-1, memo) + _countWays(n-2, memo) + _countWays(n-3, memo);

            return memo[n];
        }
    }

    public static void main(String[] args) {
        TripleStep steps = new TripleStep();
        System.out.println(steps._countWays(7));
    }
}
