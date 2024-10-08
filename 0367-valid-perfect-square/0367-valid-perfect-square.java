class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0||num==1) return true;
        int start=1;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==num/mid&&num%mid==0) return true;
            else if(mid<num/mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}