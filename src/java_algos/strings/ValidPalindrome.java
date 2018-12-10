package java_algos.strings;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.replaceAll(" ","");
        s = s.toUpperCase();
        if(s.length() < 2){
            return true;
        }

        boolean result = false;
        for(int i=0,j=s.length()-1;i<j; i++,j--){
            if(s.charAt(i) == s.charAt(j)){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
}
