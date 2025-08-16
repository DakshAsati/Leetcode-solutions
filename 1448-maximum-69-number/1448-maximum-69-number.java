class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        if(s == null || s.length() == 0) return 0;  // int return karna hai

        int maxvalue = num;  // abhi tak ka max original number hi hai

        for(int i = 0; i < s.length(); i++){
            // ek-ek character nikaalo
            String sub = s.substring(i, i+1);

            String changed = s;
            if(sub.equals("6")){
                // "6" ko "9" se replace karo
                changed = s.substring(0, i) + "9" + s.substring(i+1);
            } else if(sub.equals("9")){
                // "9" ko "6" se replace karo (agar tumhe dono check karne the)
                changed = s.substring(0, i) + "6" + s.substring(i+1);
            }

            // string ko integer me convert karo
            int val = Integer.parseInt(changed);
            maxvalue = Math.max(maxvalue, val);
        }

        return maxvalue;
    }
}
