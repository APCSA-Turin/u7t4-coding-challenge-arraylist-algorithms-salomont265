package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;

public class runner{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] intLIst = {1, 3, 1, 4, 4, 3, 1};
        for(int i =0;i<intLIst.length;i++){
            list.add(intLIst[i]);
        } 
        System.out.println(Main.fix34(list));
    }
}