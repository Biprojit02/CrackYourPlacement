class Solution {
    public int leastInterval(char[] tasks, int n) {
        //build frequency map
        int[] freq = new int[26];
        for(char ch : tasks){
            freq[ch - 'A']++;
        }

        //Max heap to store freq
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<26; i++){
            if(freq[i]>0){
                pq.add(freq[i]);
            }
        }

        int time = 0;

        while(!pq.isEmpty()){
            int cycle = n+1;
            int taskCount = 0;
            List<Integer> temp = new ArrayList<>();
            while(cycle-- > 0 && !pq.isEmpty()){
                int freqCount = pq.poll();
                if(freqCount > 1){
                    temp.add(freqCount - 1);
                }
                taskCount++;
            }

            for(int ele : temp){
                pq.add(ele);
            }

            time += (pq.isEmpty()? taskCount : n+1);
        }
        return time;
    }
}