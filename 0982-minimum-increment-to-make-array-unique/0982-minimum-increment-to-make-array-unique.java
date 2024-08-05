class Solution {
    public int minIncrementForUnique(int[] nums) {
        int moves=0;
    Arrays.sort(nums);
    for(int i=1;i<nums.length;i++){
        if(nums[i]<=nums[i-1]){
            int temp=nums[i-1]+1-nums[i];
            moves+=temp;
            nums[i]=nums[i-1]+1;
        }
    }
    return moves;
    }
}