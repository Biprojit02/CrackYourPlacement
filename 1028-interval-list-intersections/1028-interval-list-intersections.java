class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();

        int aptr = 0;
        int bptr = 0;
        int sizeA = firstList.length;
        int sizeB = secondList.length;
        while(aptr < sizeA && bptr < sizeB){
            //Check for overlap
            if(firstList[aptr][0] <= secondList[bptr][1] && firstList[aptr][1] >= secondList[bptr][0]){
                int start = Math.max(firstList[aptr][0], secondList[bptr][0]);
                int end = Math.min(firstList[aptr][1], secondList[bptr][1]);

                list.add(new int[]{start, end});
            }

            if(firstList[aptr][1] > secondList[bptr][1]){
                bptr++;
            }
            else{
                aptr++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}