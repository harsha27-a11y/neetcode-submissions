class Solution {
    public int firstMissingPositive(int[] nums) {
        int a=1;
        Set<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        for(int i=0;i<nums.length;i++){
            if(set.contains(a)) a++;
        }
        return a;
    }
}