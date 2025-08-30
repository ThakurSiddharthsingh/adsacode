public class containerwithmostwater {
    //two pointer approach
    
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, area);

            // move the smaller height pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
    //my approach but time limit exceed
    
    // public int maxArea(int[] height) {
    //     int maxwater=0;
    //     int[] count = new int[height.length];
    //     for(int i=0;i<height.length;i++){
    //         count[i]=0;
    //         for(int j=0;j<height.length;j++){
    //             if(height[i]>height[j]){
    //                 count[i]=height[j]*(j-i);
    //             }else{
    //                 count[i]=height[i]*(j-i);
    //             }
    //         }
    //     }
    //     int max=count[0];
    //     for(int k=0;k<count.length;k++){
    //         if(count[k]>max){
    //             max=count[k];
    //         }
    //     }
    //     return max;
        
    // }
    // brute force time limit exceed
    
    // public int maxArea(int[] height) {
    //     int maxWater = 0;
        
    //     for (int i = 0; i < height.length; i++) {
    //         for (int j = i + 1; j < height.length; j++) {
    //             int area = Math.min(height[i], height[j]) * (j - i);
    //             if (area > maxWater) {
    //                 maxWater = area;
    //             }
    //         }
    //     }
        
    //     return maxWater;
    // }
}



    

