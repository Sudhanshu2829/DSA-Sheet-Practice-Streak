class GfG {
    String decodeString(minHeapNode root, String encodedStr){
        String decoded= "";
        minHeapNode current=root;
        for(int i=0; i< encodedStr.length(); i++){
            if(encodedStr.charAt(i)=='0') current=current.left;
            if(encodedStr.charAt(i)=='1') current=current.right;
            if(current.data!='$'){
                decoded=decoded+current.data;
                current=root;
            }
        }
        
    return decoded;
    }
}