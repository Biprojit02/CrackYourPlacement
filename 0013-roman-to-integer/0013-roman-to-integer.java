class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        int count = 0;
        count +=hs.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i>=0;i--){
            if(hs.get(s.charAt(i))>=hs.get(s.charAt(i+1))){
                count +=hs.get(s.charAt(i));

            }
            else
            count -= hs.get(s.charAt(i));
        }
        return count;
    }
}