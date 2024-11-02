class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().orElse(0);
        List<Boolean> list = new ArrayList<>();
        for(int i : candies){
            if((i + extraCandies) >= maxCandies){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}