class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> check=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length();i++){
            check.put(s.charAt(i),check.getOrDefault(s.charAt(i),0)+1);
        };
        for(int i=0; i<t.length();i++){
             char ch=t.charAt(i);
             if(check.containsKey(ch)){
                int newCount=check.get(ch)-1;
                if(newCount>0){
                    check.put(ch,newCount);
                }else if(newCount==0){
                    check.remove(ch);
                }else{
                    return false;
                }
             }else{
                return false;
             }
        };
    return check.isEmpty();
    }
}
