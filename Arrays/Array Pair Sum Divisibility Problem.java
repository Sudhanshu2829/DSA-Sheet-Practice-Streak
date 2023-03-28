// User function Template for Java

class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
          for(int i =0; i<nums.length;i++){
            nums[i] = nums[i]%k;
        }
        Map<Integer,Integer> reminderMap = new HashMap<Integer,Integer>();
        for(int a : nums){
            if(reminderMap.containsKey(a)){
                reminderMap.put(a, reminderMap.get(a)+1);
            }
            else{
                reminderMap.put(a,1);
            }
        }
        for (int i : reminderMap.keySet()) {
            if(reminderMap.get(i)==k/2 && reminderMap.get(i)%2!=0) return false;
            else if(i==0 && reminderMap.get(i)%2!=0) return false;
            else if(i!=0){
            if(reminderMap.get(i) != reminderMap.get(k-i)){
                return false;
            }
            }
            
        }
        return true;
    }
}