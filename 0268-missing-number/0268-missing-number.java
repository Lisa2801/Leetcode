class Solution {
    public int missingNumber(int[] nums) {
        //option TC=O(2n)
        int sum=0,arr_sum=0,j=1,n=nums.length;
        for(int i=0;i<n;i++){
            sum+=j;
            j++;
            arr_sum+=nums[i];
        }
        return (sum-arr_sum);


        //option 3(TC=O(nlogn))
    //    int n=nums.length,count=0;
    //    Arrays.sort(nums);
    //    for(int i=0;i<n;i++){
    //     if(i==nums[i]) continue;
    //     else return i;
    //    }
    //    return n; 
    }
}