class Solution {
    public int findNumbers(int[] nums) {
        int total=0;
        for(int i:nums){
            int c=countDigits(i);
            if(c%2==0) total++;
        }
        return total;
    }
    public int countDigits(int n){
        return (int)(Math.log10(n)+1);
        
    }
}