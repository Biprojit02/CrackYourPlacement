class Solution {
    public long putMarbles(int[] weights, int k) {
        if(k==weights.length){
            return 0;
        }
        int pairs[]= new int[weights.length-1];
        int index=0;
        for(int i=0,j=1;i<weights.length-1;i++,j++){
            pairs[index]=weights[i]+weights[j];
            index+=1;}
        Arrays.sort(pairs);
        long min=0,max=0;
        for(int i=0,j=pairs.length-1;i<k-1;i++,j--){
            min+=pairs[i];
            max+=pairs[j];
        }
        return max-min;
        
    }
}