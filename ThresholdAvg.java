
/*
Leetcode -- 1343
In this problem we will first calculate the the average for the first window and checks if the 
avg is greater than or equals to the threshold and further we will update the sum and slide the 
window and update the average and checks if avg us greater than or equal to threshold.
 */

class ThresholdAvg{
    public int average(int nums[],int k,int threshold){
        int start = 0;
        int end = 0;
        int currSum = 0;
        int count = 0;
        float avg = 0;

        for(end=0;end<k;end++){
            currSum += nums[end++];
            avg = currSum/k;
            if(avg>=threshold){
                count++;
            }
            end = k;
            while(end<nums.length){
                currSum -= nums[start++];
                currSum += nums[end]++;
                avg = currSum/k;
                if(avg>=threshold){
                    count++;
                }
            }

        }
        return count;
    }
}