package Blind75.ArraysNeet;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int nums[],int target) {
        for(int i = 0;i<nums.length;i++) {
            for(int j = i;j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static int[] TwoSumOpti(int nums[],int target) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++) {
            int diff = target - nums[i];
            if(freqMap.containsKey(diff)) {
                return new int[] {freqMap.get(diff),i};
            }
            freqMap.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int ans[] = twoSum(arr, target);
        for(int i = 0;i<ans.length;i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
