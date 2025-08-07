
/*
 LEETCODE -- 1456
 Find out the max no of vowels in a String of window size k.
 In order to solve this question we will first create a set and add all the five vowels in it
 then calculate the vowels in the first window of size k and then slide the window and update 
 the count.
 */


import java.util.HashSet;

class VowelCount{
    public int count(String s, int k){
        int maxVowels = 0;
        int maxWin = 0;
        Set<Character> vowels = new HashSet<>();

        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                maxWin++;
            }
        }
        maxVowels = maxWin;

        for(int i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i-k))){
                maxWin--;
            }

            if(vowels.contains(s.charAt(i))){
                maxWin++;
            }
            maxVowels = Math.max(maxVowels, maxWin);
        }
        return maxVowels;
    }
}