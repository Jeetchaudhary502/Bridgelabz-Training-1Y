package com.gla;

public class sum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,67,8};
        int sum = 0;
        //for(int i=0;i<arr.length;i++){
            //sum += arr[i];
        // By for each loop
        for(int i: arr){
            sum +=arr[i];
        }System.out.println(sum);
            }
        }




