// This approach is made by using Hash Map for less time Complexity, We can also 2 use 2 nested for loops, but it tates O(n^2).
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int temp=target-nums[i];
            if(h1.containsKey(temp)) {
                int[] arr={h1.get(temp),i};
                return arr;
            }
            h1.put(nums[i],i);
        }
        return new int[] {};
        
    }
}
