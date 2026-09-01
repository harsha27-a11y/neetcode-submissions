class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int longestStreak=0;
        for(int num:nums){
            set.add(num);
        }
        for(int n:nums){
            if(!set.contains(n-1)){
                int currentNum=n;
                int currentStreak=1;
                while(set.contains(currentNum+1)){
                    currentNum+=1;
                    currentStreak+=1;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}
