package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	//richest customer wealth leetcode:
        int[][] accounts = {
                {56,78,57},
                {12,34,45},
                {98,87,76},
        };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){
         // person = row;
        // account = col;
        int ans = Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            // when you start a new column ,take a new sum for that row
            int sum=0;
            for(int account=0;account< accounts.length;account++){
            sum+=accounts[person][account];


            }
            // now we have sum of accounts of person:
            // check with overall answer;
        if(sum>ans){
            ans = sum;
        }
        }
        return  ans;

    }
}
