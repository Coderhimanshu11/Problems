package com.example.Practice;
import java.util.*;
public class xor {
    public List<Integer> findmiss(int[] nums){
        int finder=0;
        for (int i = 0; i < nums.length; i++) {
            finder^=nums[i];
        }
        return Collections.singletonList(finder);
    }
    public static void main(String[] args) {
 int[] miss={1,5,6};
 xor ins=new xor();
        System.out.println(ins.findmiss(miss));
    }
}
