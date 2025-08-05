
/*
This question is solved by using sliding window approach and circular array concept.We will just 
calculate the sum for the first window and then moves the window and updates the sum by subtracting 
a element from the start and adding the element at last by using end+1 and again updating the 
of the new window created.In this way it is done in logN time complexity.

 */


class DefuseBomb{
    public static int[] decrypt(int code[],int k){
        int n = code.length;
        int res[] = new int[n];

        if(k==0) return res;

        int start = 1;
        int end = k;
        int sum = 0;

        if(k<0){
            start = n-k;
            end = n-1;
        }

        for(int i=start;i<=end;i++){
            sum += code[i%n];
        }

        for(int i=0;i<n;i++){
            res[i] = sum;
            sum -= code[start%n];
            sum += code[(end+1)%n];

             start++;
             end++;
        }
        return res;
    }
}