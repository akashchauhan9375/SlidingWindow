/*
Leetcode -- 438
In this question we will create two arrays of size 26 each and each index of the array will
depict the alphabet numerically.We will first find the characters in p String and store the
result in the corresponding array index for ex if it is "abc" then we will put 1 on the index 
1,2,3 and will do same for the String by creating a window and for each window we will check
if both the arrays are equal if so this means anagram is present and will add the index to the
resultant arraylist. 

 */
import java.util.ArrayList;
import java.util.List;

class Anagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int pCount[] = new int[26];
        int sCount[] = new int[26];
        List<Integer> res = new ArrayList<>();

        for(char c:p.toCharArray()){
            pCount[c-'a']++;
        }

        for(int i=0;i<s.length();i++){
            sCount[s.charAt(i)-'a']++;

            if(i>=p.length()){
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            if(Arrays.equals(pCount,sCount)){
                res.add(i - p.length()+1);
            }
        }
        return res;
    }
}