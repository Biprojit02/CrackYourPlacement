//{ Driver Code Starts
import java.io.*;
import java.util.*;

class gfg {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int w = Integer.parseInt(br.readLine());

            String line = br.readLine();
            String[] tokens = line.split(" ");
            List<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] val = new int[array.size()];
            int idx = 0;
            for (int i : array) val[idx++] = i;

            String lin = br.readLine();
            String[] toke = lin.split(" ");
            List<Integer> array1 = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : toke) {
                array1.add(Integer.parseInt(token));
            }

            int[] wt = new int[array1.size()];
            idx = 0;
            for (int i : array1) wt[idx++] = i;

            // calling method knapSack() of class Solution
            System.out.println(new Solution().knapSack(w, wt, val));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // Get the number of items
        int n = wt.length;
        return knapSackRecursive(W, wt, val, n);
    }

    // Recursive function for solving the knapsack problem
    static int knapSackRecursive(int W, int wt[], int val[], int n) {
        // base case
        if (W == 0 || n == 0) return 0;
        
        // If weight of the nth item is less than or equal to W, include the item
        if (wt[n - 1] <= W) {
            return Math.max(
                val[n - 1] + knapSackRecursive(W - wt[n - 1], wt, val, n - 1), // include item
                knapSackRecursive(W, wt, val, n - 1) // exclude item
            );
        } else {
            // If weight of the nth item is more than W, skip the item
            return knapSackRecursive(W, wt, val, n - 1);
        }
    }
}


