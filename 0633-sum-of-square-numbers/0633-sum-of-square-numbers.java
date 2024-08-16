class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0||c==1) return true;
        long start=0;
        long end=(int)(Math.sqrt(c));
        while(start<=end){
            long sum=(start*start)+(end*end);
            if(sum==c) return true;
            else if(sum>c){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}