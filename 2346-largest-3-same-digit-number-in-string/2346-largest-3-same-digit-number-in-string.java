class Solution {
    public String largestGoodInteger(String num) {
        if(num == null || num.length() == 0)return ""; 

    String maxcount = "";

        for(int i = 0; i <= num.length() - 3; i++){
        String sub = num.substring(i, i + 3);

        if(sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2)){

        if(maxcount.compareTo(sub) < 0){
            maxcount = sub;
        }

        }
        }
      return maxcount;

    }
   
}