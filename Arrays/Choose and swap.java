class Solution{
    String chooseandswap(String A){
        int arr[] = new int[26];
        for(int i = 0; i<26; i++){
            arr[i] = -1;
        }
        char [] chararr = A.toCharArray();
        int n = A.length();
        for(int i = 0 ; i<n; i++){
            if( arr[A.charAt(i)-'a'] == -1){
            arr[A.charAt(i)-'a'] = i;
        }     }
        char temp1 = ' ', temp2 = ' ';
        boolean flag = false;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<A.charAt(i)- 'a'; j++){
                if(arr[j] > arr[A.charAt(i)-'a']){
                    temp1 = (char)('a' + j);
                    temp2 = A.charAt(i);
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                break;
            }
        }
        for(int i = 0; i<n; i++){
            if(chararr[i] == temp1){
                chararr[i] = temp2;
            }
            else if(chararr[i] == temp2){
                chararr[i] = temp1;
            }
        }
        String str = new String(chararr);
        return str;
    }
}