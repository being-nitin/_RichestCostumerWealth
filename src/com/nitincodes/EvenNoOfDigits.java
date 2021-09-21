package com.nitincodes;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {112,34,676,5678};

    }
    static int FindNumberOfDigits(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }
    static boolean even(int num){
        int noOfDigits = digits(num);
        if(num%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return num;
    }
}
