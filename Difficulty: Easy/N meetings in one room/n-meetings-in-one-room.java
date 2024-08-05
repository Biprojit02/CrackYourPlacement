//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) end[i] = Integer.parseInt(inputLine[i]);

            int ans = new Solution().maxMeetings(n, start, end);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Meetings{
    int start;
    int end;
    public Meetings(int start, int end){
        this.start = start;
        this.end = end;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        Meetings[] meet = new Meetings[n];
        
        for(int i = 0; i<n; i++){
            meet[i] = new Meetings(start[i], end[i]);
        }
        
        Arrays.sort(meet, (a, b)->(a.end - b.end));
        
        int count = 1;
        int freeTime = meet[0].end;
        
        for(int i = 1; i<n; i++){
            if(meet[i].start > freeTime){
                count++;
                freeTime = meet[i].end;
            }
        }
        return count;
    }
}
