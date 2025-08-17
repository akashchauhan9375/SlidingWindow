
/*
Leetcode -- 992
In this question we will calculate the count of subarray with atmost - atmost k-1
this will result into the subarray with k different integer.

 */

import java.util.HashMap;
import java.util.Map;

class SubArrayWithKDiffInteger{
    public int countSubArray(int nums[],int k){
       return count(nums,k) - count(nums,k-1);
    }

    public int count(int nums[],int k){
        int start = 0;
        int end = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        while(end<nums.length){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);

            while(map.size()>k){
                map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start])==0){
                    map.remove(nums[start]);
                }
                start++;
            }
            count += (end-start+1);
            end++;
        }
        return count;

    }
}