
/*
LEETCODE -- 643
this problem is solved by sliding window technique.first calculate the sum of first window
and keep keep sliding the window and update the maxSum.As soon we will get the maxSUm we will
be able to calculate the average very easily.
 */


class MaxAvg{
    public double maxAvg(int nums[],int k){
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int maxSum = sum;

        int start = 0;
        int end = k;

        while(end <nums.length){
            sum -= nums[start];
            start++;

            sum += nums[end];
            end++;

            maxSum = Math.max(sum,maxSum);
        }
        return (double) maxSum/k;
    }
}