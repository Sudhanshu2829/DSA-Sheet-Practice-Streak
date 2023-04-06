/*complete the Function*/

class Solution {
    public ArrayList<String> genIp(String s) {
           ArrayList<String> res = new ArrayList<>();
        util(s, 0, "", res);
        return res;
    }
    
    public static void util(String s, int i, String t, List<String> res) {
        if (i == 4) {
            if (s.length() == 0) {
                res.add(t.substring(1));
            }
        } else {
            if (s.length() > 0) {
                util(s.substring(1), i + 1, t + "." + s.charAt(0), res);
            }
            if (s.length() > 1 && Integer.parseInt(s.substring(0, 2)) >= 10) {
                util(s.substring(2), i + 1, t + "." + s.substring(0, 2), res);                
            }  
            if (s.length() > 2 
                && Integer.parseInt(s.substring(0, 3)) >= 100 
                && Integer.parseInt(s.substring(0, 3)) <= 255) {
                util(s.substring(3), i + 1, t + "." + s.substring(0, 3), res);
            }
        }
    }
}