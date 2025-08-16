
/*
Leetcode --1248 
In this problem we just count the odd no of elemnt in the array and then slide the window and
keep tracking the count.
In the below solution one confusion may arise that tempCount is reinitialised to 0,this is 
because we are reseting its value whenever sliding the window and whenever oddCount equals k.
 */

class NiceSubArray{
    public int nice(int nums[],int k){
        int start = 0;
        int end = 0;
        int tempCount = 0;
        int result = 0;
        int minWin = 0;
        int oddCount = 0;

        while(end<nums.length){
            if(nums[end++]%2==1){
                oddCount++;
                tempCount = 0;
            }
            while(oddCount == k){
                tempCount++;
                if(nums[start++]%2==1){
                    oddCount--;
                }
            }
            result += tempCount;
        }
        return result;
    }
}