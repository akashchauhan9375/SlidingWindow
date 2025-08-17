
/*
Leetcode -- 713
In this problem we start from 0th index and keep traversing the array and calculating he product 
and checking if the product is greater than k and if it greater than k then slide the window
by removing the first element.
One confusion in this question is the count. We are using end-start because this will calculate
the single elment and multi element both. for example [5,2] is a valid subarray this will calculate
[5],[2] and [5,2] and three valid subarray.
 */


class SubArrayProduct{

    public int countSubArrays(int nums[],int k){
    int start = 0;
    int end = 0;
    int prod = 1;
    int count = 0;
    if(k<=1) return 0;

    while(end<nums.length){
        prod = prod*nums[end++];
        if(prod>k){
            prod = prod/nums[start++];
        }
        count =+ (end-start);
    }
    return count;
  }
}