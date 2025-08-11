/*
Leetcode -- 567
In this question we will use the same method as used in leetcode ques no 438, the only difference
is that here we have to return true or false
 */
import java.util.Arrays;

class StringPermutation{
    public boolean check(String s1, String s2){
        int s1Count[] = new int[26];
        int s2Count[] = new int[26];

        for(char c:s1.toCharArray()){
            s1Count[c-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            s2Count[s2.charAt(i)-'a']++;

            if(i>=s1.length()){
                s2Count[s2.charAt(i-s1.length())-'a']--;
            }

            if(Arrays.equals(s1Count,s2Count)){
            return true;
            }

        }
        return false;

    }
}