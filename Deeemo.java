class Deeemo{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        int max_sum = INT_MIN;
        for(i = 0;i<n;i++){
        for(j = i;j<n;j++){
        int sum = 0;
        for( int k = i;k<=j;k++){
            sum += arr[k];
            
        }
        // Your code here
        max_sum = max(max_sum,sum);
        
        
    }
    
}
return max_sum;
}

}