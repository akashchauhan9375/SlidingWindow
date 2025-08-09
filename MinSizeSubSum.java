
/*
we will start from 0th index and and adds the element till the sum is not greater than or equals
to the target and when the condition occurs then we will store the window size and slide the
window by removing the first element and again checks the condition if the sum is greater than
or equals to the target or not and hence nested while loop will result the min size window.
 */


class MinSizeSubSum{
    public int sum(int nums[],int target){
        int currSum = 0;
        int start = 0;
        int end = 0;
        int minWindow = Integer.MAX_VALUE;

        while(end <nums.length){
            currSum += nums[end];
            end++;

            while(currSum>=target){
                int currWinSize = end - start;
                minWindow = Math.min(minWindow,currWinSize);
                currSum -= nums[start];
                start++;
            }
        }


        return minWindow == Integer.MAX_VALUE ?0:minWindow;
    }
}