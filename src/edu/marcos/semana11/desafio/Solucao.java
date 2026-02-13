package edu.marcos.semana11.desafio;


public class Solucao {
    public int[] twoSum(int[] nums, int target) {
        int num;

        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
               if (nums[j] + num == target){
                   return new int[] {i, j };
               }

            }

        }
        return new int[] {};


    }
}
