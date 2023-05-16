class Pos{
    int x; 
    int turn;
    Pos(int a,int b)
    {
        x=a;
        turn=b;
    }
}

class Solution{
    static int minThrow(int N, int arr[]){
    HashMap<Integer,Integer> mp;
    HashMap<Integer,Integer> vis;
    
    mp = new HashMap<>(); // snake/laddder -> destination mapping
    vis= new HashMap<>();
    for(int i=0;i<arr.length;i++){
        mp.put(arr[i],arr[i+1]);
        i++;
    }
    Queue<Pos> q= new LinkedList<>();
    Pos start = new Pos(1,0);
    q.offer(start);
    vis.put(1,1); // o visited
    while(!q.isEmpty()){
        Pos curr= q.poll();
        int x = curr.x;
       // System.out.println(" pos = "+ x);
        int turn = curr.turn;
        int finalPos;
        if(x==30) return turn;
        
        for(int i=1;i<=6;i++){
            
        if(x+i<=30)
        {
            finalPos= x+i;
            if(mp.containsKey(finalPos)==true){
                finalPos= mp.get(finalPos);
            }
            //System.out.println("final pos = "+ finalPos);
            if(vis.containsKey(finalPos)==false){
                vis.put(finalPos,1);
                q.offer(new Pos(finalPos,turn+1));
            }
            
         }
         else 
            break;
         
        }

    }
        return -1;
    }
}
