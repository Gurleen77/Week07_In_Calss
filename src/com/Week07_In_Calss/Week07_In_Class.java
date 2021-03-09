package com.Week07_In_Calss;

import java.util.Arrays;

public class Week07_In_Class {
    public static void main(String[] args) {
        int[] arrInt = {23,45,23,12,65,37,76,67,34,56};
        int[] arrEven = new int[10];
        int[] arrOdd = new int[10];
        int countEven = 0;
        int countOdd = 0;
        int total = 0;
        int max = 0;
        for (int i = 0; i < arrInt.length;i++){
            total += arrInt[i];
            if(arrInt[i]%2 == 0){
                arrEven[i] = arrInt[i];
            }else {
                arrOdd[i] = arrInt[i];
            }
        }
        for (int i = 0; i < arrInt.length;i++){
            for (int j = i+1;j<arrInt.length;j++){
                if(arrInt[i] < arrInt[j]){
                    max = arrInt[i];
                    arrInt[i] = arrInt[j];
                    arrInt[j] = max;
                }
            }
        }
        System.out.println("The array in descending order is ");
        System.out.println(Arrays.toString(arrInt));
        for (int i = 0; i < arrInt.length;i++){
            for (int j = i+1;j<arrInt.length;j++){
                if(arrInt[i] > arrInt[j]){
                    max = arrInt[i];
                    arrInt[i] = arrInt[j];
                    arrInt[j] = max;
                }
            }
        }
        System.out.println("The array in ascending order is ");
        System.out.println(Arrays.toString(arrInt));
        System.out.println("The total number of Even elements is as follows ");
        for (int i = 0; i < arrEven.length;i++){
            if (arrEven[i] != 0){
                System.out.print(arrEven[i] + " ");
            }
        }
        System.out.println("\nThe total number of odd elements is as follows ");
        for (int i = 0; i < arrOdd.length;i++){
            if (arrOdd[i] != 0){
                System.out.print(arrOdd[i] + " ");
            }
        }
        System.out.println("\nThe total sum of all the elements is "+total);
    }
}
