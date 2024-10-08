class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] newInterval = intervals[0];
        ArrayList<int[]> list = new ArrayList<>();
        list.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
            else{
                newInterval = interval;
                list.add(newInterval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}