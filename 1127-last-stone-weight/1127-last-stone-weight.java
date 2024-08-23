class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for(int s : stones){
            pq.add(s);
        }

        while(pq.size() > 1){
            int num1 = pq.poll();
            int num2 = pq.poll();
            int res = num1 - num2;
            pq.add(res);
        }

        while(!pq.isEmpty()){
           return pq.peek(); 
        }
        return 0;
    }
}