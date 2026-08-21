class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] arr=new int[k];
        int j=0;
        while(!map.isEmpty() && j<k ){
            int max=0;
            int e=0;
            for(var ele:map.entrySet()){
                if(ele.getValue()>max){
                    max=ele.getValue();
                    e=ele.getKey();
                }
            }
            arr[j]=e;
            map.remove(e);
            j++;
        }
        return arr;
    }
}
