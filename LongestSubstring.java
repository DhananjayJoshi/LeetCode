class Solution {
    public int lengthOfLongestSubstring(String s) {
        //BRUT FORCE
//         char [] chars = s.toCharArray();
//         int maxLength = 0;
        
//         for (int i=0;i<s.length();i++){
//             Set <Character> charSet = new HashSet<>();
//             int len = 0;
//             for(int j=i; j<s.length(); j++){
//                    if(charSet.contains(chars[j])){
//                        break;
//                    }else{
//                        charSet.add(chars[j]);
//                        len ++;
//                    }
//             }
//             if(len > maxLength){
//                 maxLength = len;
//             }
//             charSet.clear();
//         }
//         return maxLength;
    
        Map<Character, Integer> charToPosition = new HashMap<>();
        
        int j = 0; 
        int maxLen = 0;
        int len = 0;
        
        for (int i=0; i<s.length(); i++){
            if(charToPosition.containsKey(s.charAt(i))){
                j = Math.max(j,charToPosition.get(s.charAt(i))+1);
            }
            charToPosition.put(s.charAt(i), i);
            maxLen = Math.max(maxLen, (i-j)+1);
        }
        return maxLen;
    }
}