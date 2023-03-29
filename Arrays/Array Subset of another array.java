
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long, Integer> map = new HashMap<>();
        for(int i=0; i<(int)n; i++){
            map.put(a1[i], map.getOrDefault(a1[i],0)+1);
        }
        for(int i=0; i<(int)m; i++){
            if(map.containsKey(a2[i]) && map.get(a2[i])>0){
                map.put(a2[i],map.get(a2[i])-1);
            }
            else{
                return "No";
            }
        }
        return "Yes";
    }
}