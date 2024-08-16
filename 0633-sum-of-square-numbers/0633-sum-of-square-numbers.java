class Solution {
    public boolean judgeSquareSum(int c) {
        // if(c==0||c==1) return true;
        // int start=1;
        // int end=c/2;
        // int temp=0;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(mid*mid==c-1||mid*mid==c) return true;
        //     else if(mid>c/mid){
        //         end=mid-1;
        //     }
        //     else{
        //         start=mid+1;
        //     }
        // }
        // temp=end;
        // for(int i=1;i<=temp;i++){
        //     if(i*i+temp*temp==c) return true;
        //     else return false;
        // }
        // return false;
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