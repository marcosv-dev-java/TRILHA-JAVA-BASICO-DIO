package edu.marcos.semana11.desafio;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverse = 0;
        int original = x;

        while(x > 0){
            int lastNumber = x % 10;
            reverse = (reverse * 10) + lastNumber;
            x = x / 10;
        }

        return original == reverse;

    }
}
