class Solution {
    public String longestPalindrome(String s) {

        if(s.length() <= 1){
            return s;

        }
            String LPS = "";

            for(int i = 1; i < s.length(); i++){

                int low = i;
                int high = i;

                while(s.charAt(low) == s.charAt(high)){
                    low--;
                    high++;


                    if(low == -1 || high == s.length())
                    break;
                }

              String Palindrome = s.substring(low +1 , high);
              if(Palindrome.length() > LPS.length()){
                LPS = Palindrome;
              }

              low = i - 1;
              high =  i;
              while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length())
                break;
              }

              Palindrome = s.substring(low + 1, high);
              if(Palindrome.length() > LPS.length()){
                LPS = Palindrome;
              }

            }
              return LPS;
            }

        }
            
        

        
    