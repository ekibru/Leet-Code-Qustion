package Leetcode;

public class Duplicate {
    public boolean isPalindrome(int x) {

        String input = String.valueOf(x);
        int i = 0;
        int j = input.length() - 1;
        while(i < j){
            if(input.charAt(i++) != input.charAt(j--))
                return false;
        }
        return true;
    }
}
