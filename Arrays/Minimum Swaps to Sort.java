class Solution
{
    public int minSwaps(int nums[])
    {
     int swapCount =0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);            
        }
        int i=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey()==nums[i]){
            }
            else{
                nums[entry.getValue()]=nums[i];
                map.put(nums[i],entry.getValue());
                map.put(entry.getKey(),i);
                nums[i] = entry.getKey();
                swapCount++;
            }
            i++;
        }
        
        return swapCount;
    }
}