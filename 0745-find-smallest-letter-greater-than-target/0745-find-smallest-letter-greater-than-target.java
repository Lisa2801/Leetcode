class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        if(target>letters[letters.length-1]) return letters[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            char mid_char=letters[mid];
            if(mid_char>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}