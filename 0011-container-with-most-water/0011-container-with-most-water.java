class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1 ;
        int maxarea = 0;

        while(left < right){
            int width = right - left;
            int length = Math.min(height[right], height[left]);
            int area = width * length;
            maxarea = Math.max(area, maxarea);


        if(height[left] < height[right]){
            left++;
        }else{
            right--;
        }
        
    }
     return maxarea;
    }
    
}