class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        for(int i=0,j=s.length()-1;i<s.length() && j>=0;i++,j--) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
        }
        return true;
        
    }
}
