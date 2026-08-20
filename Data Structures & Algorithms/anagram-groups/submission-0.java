class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] ch1=s.toCharArray();
            Arrays.sort(ch1);
            String sorted=new String(ch1);
            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
