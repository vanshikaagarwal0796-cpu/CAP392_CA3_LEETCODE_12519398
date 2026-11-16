class Solution {
    public String toLowerCase(String s) {
       String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);//ch ki numeric value me 32 add kiya hai phir use character me convert kiya hai and explicit type casting
            }

            result = result + ch;//JAVa allow add of str to ch
        }

        return result;
     
    }
}
