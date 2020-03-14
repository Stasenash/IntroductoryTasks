package com.example.task2;

import com.sun.istack.internal.Nullable;

public class Task2Main {
    public static void main(String[] args) {

        decryptData(new int[]{5,100,20,66,16},50,1,3);
        decryptData(new int[]{5,100,20,66,16},50,1,7); //не топь, еще что ли проверок надобавлять
    }

    public static int[] decryptData(int[] price, int discount, int offset,int readLength){
        if (price == null || price.length == 0 || discount < 1 || discount > 99 || offset < 0 || readLength < 1) throw  new IllegalArgumentException("Wrong data");
        int max = readLength + offset;
        int[] result = new int[readLength];
        for (int i = offset; i < max && i < price.length; i++){
            result[i - offset] = (int) Math.floor(price[i] * (100 - discount) * 0.01);
        }
        return result;
    }
}
