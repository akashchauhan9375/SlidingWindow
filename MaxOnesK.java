
/*
Leetcode -- 1004

In this problem we will start from 0th index and calculates the no of zero and if the zeros
are more than k then we will slide the window and update the no of zeros and keep calculating
and updating the window size as window size will return no of ones in that window.
 */

class MaxOnesK{
    public int max(int []nums,int k){
        int start = 0;
        int end = 0;
        int zero = 0;
        int maxOnes = 0;

        for(end=0;end<nums.length;end++){
            if(nums[end] == 0){
                zero++;
            }

            while(zero>k){
                if(nums[start] == zero){
                    zero--;
                }
                start++
            }
            maxOnes = Math.max(maxOnes,end-start+1);
        }
        return maxOnes;
    }
}