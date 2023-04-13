class LRUCache
{
    static int capacity;
    static Queue<Integer> ob=new ArrayDeque<>();
    static HashMap<Integer,Integer> obj=new HashMap<>();
    
    LRUCache(int cap)
    {
        ob.clear();
        
        obj.clear();
        capacity=cap;
        
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        if(obj.containsKey(key)==false){
            return -1;
        }int temp;
        ob.remove(key);
        ob.add(key);
        return obj.get(key);
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        int number;int add;
       if(obj.containsKey(key)==false && obj.size()==capacity)
       {
           number=ob.remove();
           obj.remove(number);
           obj.put(key,value);
           add=key;
       }
       else{    //this solution is correct but it needs time complexity o(1)
           number=key;
           if(obj.containsKey(key)==false){
                obj.put(key,value);
           }
           else{
               obj.replace(key,value);
           }
           add=key;
       }
        ob.remove(key);
        ob.add(add);
    }
}