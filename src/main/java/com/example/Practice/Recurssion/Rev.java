package com.example.Practice.Recurssion;

public class Rev {
    public void rev(int[] arr, int n){
        reverseArray(arr,0,n-1);
    }
    public void reverseArray(int[] arr, int start, int end){
        if(start>end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n= arr.length;;
        Rev obj= new Rev();
        obj.rev(arr,n);
         for(int num : arr ){
             System.out.print(num+" ");
         }
    }
}
