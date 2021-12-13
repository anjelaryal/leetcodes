class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
        return 0;
    }
        int max = 1;
    for(int i = 0; i < s.length(); i++){
        ArrayList<Character> list = new ArrayList<>();
        list.add(s.charAt(i));
        int maxCount = 1;
        for(int j = i + 1; j < s.length(); j++ ){
            if(list.contains(s.charAt(j))){
                break;
            }else{
                maxCount++;
                list.add(s.charAt(j));
            }
        }
        if(maxCount > max){
            max = maxCount;
        }
    }
    return max;
    }
}
