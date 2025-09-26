package org.officeAssignment.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {

 /*   public int largestSale() {
        int sales[] = {10, 26, 5, 50, 2, 11, 22};
        int day = 0;
        int largest = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > largest)
                largest = sales[i];

            if (largest == sales[i]) {
                day = i;
            }

        }
        return day;
    }*/

    public static void main(String[] args) {
        //A/*rrayDemo obj = new ArrayDemo();
//
//            int day = obj.largestSale();
//        switch (day) {
//            case 0:
//                System.out.println("Monday has largest sale");
//                break;
//            case 1:
//                System.out.println("Tuesday has largest sale");
//                break;
//            case 2:
//                System.out.println("Wednesday has largest sale");
//                break;
//            case 3:
//                System.out.println("Thursday has largest sale");
//                break;
//            case 4:
//                System.out.println("Friday has largest sale");
//                break;
//            case 5:
//                System.out.println("Saturday has largest sale");
//                break;
//            case 6:
//                System.out.println("Sunday has largest sale");
//                break;
//            default:
//        }*/

/*        int arr1[]={12,23,54,35,4};
        int arr2[]={23,54,65,4,3};

        int temp[]=new int[5];//using tempporary array

        for (int i=0;i<arr1.length-1;i++)
        {
            temp[i]=arr1[i];
            arr1[i]=arr2[i];
            arr1[i]=temp[i];
            //arr2[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println((Arrays.toString(temp)));




        *//*System.out.println("first array after swap" +arr1);
        System.out.println("second array after swap" +arr2);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println("first array after swap"+arr1[i]);
            int temp3[]=arr1[i];
            System.out.println();
        }
        for(int temp3:arr1)
        {
            for(int temp4:arr2)
                System.out.println();
        }*//*

        int a=10;//
        int b=5;//
  

        System.out.println();*/


        int arr[] = {45, 43, 46, 41};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int actualSum=0,expectedSum=0,n=46,missingNumber;
        expectedSum=n*(n+1)/2;
        System.out.println(expectedSum);
        for (int i = 0; i < arr.length; i++) {
            actualSum=actualSum+arr[i];
        }
        missingNumber=expectedSum-actualSum;
        System.out.println("Missing Number is "+missingNumber);
        //System.out.println(Arrays.toString(arr));

        /*int arr[]={1,4,3,5};
        ArrayDemo obj=new ArrayDemo();
        //int temp=arr[0];
        for(int i=1;i<=5;i++)
        {
            boolean isPresent=obj.checkSeries(arr,i);
            if(isPresent==false)
            {
                System.out.println("Missing value is"+ i);
                break;
            }
        }
    }

    public boolean checkSeries(int[] arr, int j) {

        for(int i=0;i< arr.length;i++){
                if(arr[i]==j)
                {
                    return true;
                }
        }
        return false;
    }*/

    }
}
