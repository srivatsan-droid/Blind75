package Blind75.ArraysNeet;

import java.util.HashMap;

/*
@author : Srivatsan
Basically this Problem is used to Determine if a Number from the array appears more than once if yes return true else return false
Approach :
Brute Force : Linearly Traverse throuhg the entire array and check for the number which is appearing more than  once or twice if yes return true else return false
Optimized :
Using an HashMap to store the number and its frequency if the frequency is greater than 1 return true else return false
 */
public class containsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> unique = new HashMap<>();
        for(int i = 0;i<nums.length;i++) {
            unique.put(nums[i],unique.getOrDefault(nums[i],0)+1);
        }
        int freq = 2;
        boolean ans = false;
        for(int key : unique.keySet()) {
            if(unique.get(key) >= freq) {
                ans = true;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
