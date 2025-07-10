class Solution {
    public String minWindow(String s, String t) {
        int windowstart = 0, windowend = 0;
        int charactercount = t.length();
        String output = "";
        Map<Character,Integer> charactercountmap = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            charactercountmap.put(c,charactercountmap.getOrDefault(c,0) + 1);
        }
        while(windowend < s.length()){
            if(charactercountmap.containsKey(s.charAt(windowend))){
                if(charactercountmap.get(s.charAt(windowend)) > 0){
                    charactercount = charactercount - 1;

                }
                charactercountmap.put(s.charAt(windowend), charactercountmap.get(s.charAt(windowend)) - 1);

            }
            if(charactercount == 0){
                while(windowstart <= windowend){
                    if(charactercountmap.containsKey(s.charAt(windowstart))){
                        boolean isSubArrayStillValid = charactercountmap.get(s.charAt(windowstart)) + 1 <= 0 ? true : false;
                        if(isSubArrayStillValid){
                            charactercountmap.put(s.charAt(windowstart), charactercountmap.get(s.charAt(windowstart)) + 1);
                            windowstart++;
                        }else{
                            break;
                        }
                    }else{
                        windowstart++;
                    }
                }

                String temp = s.substring(windowstart, windowend + 1);
                if(output.isEmpty() || output.length() > temp.length()){
                    output = temp;
                }

            }
            windowend++;
        }
        return output;

        
    }
}