class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left,star;
        left = new  Stack<>();
        star = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') left.push(i);
            else if(s.charAt(i) == '*')star.push(i);
            else{
                if(!left.isEmpty()) left.pop();
                else if(!star.isEmpty()) star.pop();
                else return false;
            }

        }

        while(left.size() != 0){
            if(star.size() == 0)return false;
            if(star.peek() > left.peek()){
                star.pop();
                left.pop();
            }else{
                return false;
            }
        }
        return true;
    }
}