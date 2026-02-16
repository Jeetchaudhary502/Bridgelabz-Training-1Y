package com.gla;

public class findNUm {
    public static void main(String[] args){
        int[] arr = {1,44,55,78,-2};
        int search = 58;
        boolean found = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == search){
                found = true;
                break;
            }


        }  if(found == true){
            System.out.println("Exists");
        } else {
            System.out.println("Element not found");
        }
    }

}
