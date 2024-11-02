class Solution {
    public boolean canPlaceFlowers(int[] fls, int n) {
        int max = 0;
        int f = -1;
        int l = -1;

        for(int i = 0; i<fls.length; i++){
            if(fls[i] == 0){
                continue;
            }
            else if(l == -1){
                f = i;
                l = i;
            }
            else{
                l = i;
            }
        }  

        //All zeros
        if(l == -1){
            max = (fls.length + 1)/2;
        }else{
            int left = f;
            int right = fls.length - 1 - l;

            max = left/2;
            max += right/2;
            
            int count = 0;
            for(int i = f + 1; i<=l - 1; i++){
                if(fls[i] == 0){
                    count++;
                }
                else{
                    max += (count - 1)/2;
                    count = 0;
                }
            }
            max += (count - 1)/2;
        } 
        return n <= max;
    }
}