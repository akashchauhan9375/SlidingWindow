/*
LEETCODE - 904
This problem solved by the sliding window approach b y creating a hashmap and keep tracking the 
count of the fruits.We took 2 pointer initialised them to 0, moving one pointer using the for loop 
till the end of the array and adding the fruits in to the hashmap and moving the pointer forward 
we are getting the count of thart particular fruit from the map updating its value in to the map.
Then we use a while and checks if the basket size is more than 2 if it is so then we will remove 
the fruit one by one in the order as they are inserted and finally if the fruitCount is 1 then we 
will completely remove that type of fruit else we will deduct the 1 from the count of the fruit and
in every iteration we will calculate the max value and keep updating it in every other iteration
At last we will be able to get the maximum value.
 */
import java.util.HashMap;
import java.util.Map;

class FruitBasket{
    public int fruits(int[] fruit){
        int left = 0;
        int right =0;
        int maxFruit = 0;
        Map<Integer,Integer> basket = new HashMap<>();
        
        for(right =0;right<fruit.length;right++){
            int currentCount = basket.getOrDefault(fruit[right],0);
            basket.put(fruit[right],currentCount+1);
        

         while(basket.size()>2){
            int fruitCount = basket.get(fruit[left]);
            if(fruitCount == 1){
                basket.remove(fruit[left]);
            }
            else{
                basket.put(fruit[left],fruitCount-1);
            }
            left++;
         }
    
    }
        return maxFruit;
    }
}