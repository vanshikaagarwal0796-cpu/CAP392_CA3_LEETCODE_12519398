class Solution {
    boolean isalphanumeric(char ch){
    if((ch>='0'&&ch<='9')||(Character.toLowerCase(ch)>='a'&& Character.toLowerCase(ch)<='z')){
        return true;
    }
    return false;
    }
    public boolean isPalindrome(String s) {
     int i=0;
     int j=s.length()-1;
     while(i<j){
        char ch1=s.charAt(i);
        char ch2=s.charAt(j);
        if(!isalphanumeric(ch1)){
            i++;
            continue;//matlab skip remaining code fir se while chala 
        }
        if(!isalphanumeric(ch2)){
            j--;
            continue;
        }  
    if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)){
        return false;
    }
    i++;
    j--;
     } 
     return true;  
    }
}
