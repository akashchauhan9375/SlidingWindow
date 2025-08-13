/*

Leetcode -- 1876
In this problem we will create a new array of size 26 and travserse through the String and increase
the count of the index corresponding to the no of alphabetic and if the size of the window reaches
to 3 then we will check whether the stored result in the array has only count one for an alphabetic
if it is more than one then that particular window does not have good string.
After chexking we will slide the window by removing the character at first index and decreasing its
count from the array.Additionaly we will make a function that will check whether the array is good 
or not.
 */


class GoodString{
    public int countGoodString(String s){
        int arr[] = new int[26];
        int start = 0;
        int end = 0;
        int count = 0;
        for(end=0;end<s.length();end++){
            arr[s.charAt(end)-'a']++;
            int range = end-start+1;
            if(range==3){
                if(isGoodString(arr)){
                    count++;
                }
                arr[s.charAt(start++)-'a']--;
            }
        }
        return count;
    }

    public boolean isGoodString(int arr[]){
        for(int i=0;i<26;i++){
            if(arr[i]>1){
                return false;
            }
        }
        return true;
    }
}