class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<>();

        int index = 0;
        while(index < words.length){
            int count = words[index].length();
            int last = index + 1;
            while(last < words.length){
                if(count + 1 + words[last].length() > maxWidth) break;
                count += 1 + words[last].length();
                last++;
            }

            StringBuilder builder = new StringBuilder();
            builder.append(words[index]);
            int diff = last - index - 1;


            if(last == words.length || diff == 0){
                for(int i = index + 1; i < last; i++){
                    builder.append(" ");
                    builder.append(words[i]);
                }

                for(int i = builder.length(); i < maxWidth; i++){
                    builder.append(" ");

                }
            }else{
                int spaces = (maxWidth - count) / diff;
                int extraspace = (maxWidth - count) % diff;
                for(int i = index + 1; i < last; i++){
                    for(int s = spaces; s > 0; s--){
                        builder.append(" ");

                    }

                    if(extraspace > 0){
                        builder.append(" ");
                        extraspace--;


                    }
                    builder.append(" ");
                    builder.append(words[i]);

                }
                }
                lines.add(builder.toString());
                index = last;
        }
        return lines;
        
    }
}