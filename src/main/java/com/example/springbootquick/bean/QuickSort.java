package com.example.springbootquick.bean;

public class QuickSort {
    private static int count;

    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>=high){
            return;
        }
        i=low;
        j=high;
        temp=arr[low];
        while(i<j){
            while(temp<arr[j]&&i<j){
                j--;
            }
            while(temp>=arr[i]&&i<j){
                i++;
            }
            if (i<j){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        count++;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }

    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        System.out.println(arrayToString(arr,"未排序"));
        quickSort(arr,0,arr.length-1);
        System.out.println(arrayToString(arr,"排序"));
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("循环次数："+count);
    }

    private static String arrayToString(int[] arr,String flag){
        String str = "数组为("+flag+"):";
        for(int a:arr){
            str += a + "\t";
        }
        return str;
    }
}
