//Given an array of ints, and integer target, return indices of two numbers such that they add up
import java.util.HashMap;
import java.lang.Math;
//to target 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //we're going to use a onepasshashmap (to solve this 
        HashMap<Integer,Integer> onePassHash = new HashMap<>();
        //now we're going to iterate over the Array 
        for (int i = 0; i<nums.length; i++){
            //we're going to use the values as keys as the lookup is faster 0(1)
            int diff = target - nums[i];
            if (onePassHash.containsKey(diff)){
                int[] solution = {onePassHash.get(diff), i};
                return solution;
            }
            onePassHash.put(nums[i], i);
        }
        int[] emptyArray = {};
        return emptyArray;
    }
}