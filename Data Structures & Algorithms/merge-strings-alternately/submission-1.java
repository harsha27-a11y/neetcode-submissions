class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        String res="";
        for(int i=0;i<(l1>l2 ? l2 :l1 );i++){
            res+=word1.charAt(i);
            res+=word2.charAt(i);
        }
        if(l1>l2){
            res+=word1.substring(l2);
        }
        if(l2>l1){
            res+=word2.substring(l1);
        }
        return res;
    }
}