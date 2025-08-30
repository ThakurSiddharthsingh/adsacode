public class TrappingRainwater {
    //brute force

    // public int trap(int[] height) {
    //     int n = height.length;
    //     int[] leftMax = new int[n];
    //     int[] rightMax = new int[n];
    //     int water = 0;

    //     // Fill leftMax array
    //     leftMax[0] = height[0];
    //     for (int i = 1; i < n; i++) {
    //         leftMax[i] = Math.max(leftMax[i - 1], height[i]);
    //     }

    //     // Fill rightMax array
    //     rightMax[n - 1] = height[n - 1];
    //     for (int i = n - 2; i >= 0; i--) {
    //         rightMax[i] = Math.max(rightMax[i + 1], height[i]);
    //     }

    //     // Calculate trapped water
    //     for (int i = 0; i < n; i++) {
    //         water += Math.min(leftMax[i], rightMax[i]) - height[i];
    //     }

    //     return water;
    // }
    //optimized 2 pointer
    
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }
}



    

