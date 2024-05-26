class Solution {
    
    public int maxSubArray(int[] nums) {
        return maxSum( nums );
    }

    public int maxSum( int [] arr ) {
        int ans = Integer.MIN_VALUE;
        int sum = 0; 
        for( int i=0; i<arr.length; i++ ) {
            sum += arr[i];
            if ( sum > ans ) {
                ans = sum;
            }
            if (sum<0) {
                sum = 0;
            }

        }
        return ans;
    }

}