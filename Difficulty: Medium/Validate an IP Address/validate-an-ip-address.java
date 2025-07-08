class Solution {
    public boolean isValid(String s) {
       
        String zeroTo255 = "([1-9]\\d{0,1}|1\\d{2}|2[0-4]\\d|25[0-5]|0)";
        String ipRegex = "^(" + zeroTo255 + "\\.){3}" + zeroTo255 + "$";

        return s.matches(ipRegex);
    
    }
}