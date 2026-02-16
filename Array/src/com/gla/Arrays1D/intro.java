package com.gla;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class intro {
    public static void main(String[] args){
        // dataType[] referenceVariable = new dataType[n]; Here, reference variable is stored in stack memory as it is local variable,
        // where as by using new we created an object which will be stored in heap memory
        int[] arr = new int[100];
        for(int i =0; i<arr.length;i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
