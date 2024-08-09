class Solution {
    public void moveZeroes(int[] nums) {
        //method 1 Time=O(n) Space=O(1)
        // int index=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         nums[index++]=nums[i];
        //     }
        // }
        // while(index<nums.length){
        //     nums[index++]=0;
        // }

        //method 2 Time=O(n) Space=O(1)
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
    }
}