package com.example.task2;

import com.sun.istack.internal.Nullable;

public class Task2Main {
    public static void main(String[] args) {
    }

    public static @Nullable int[] decryptData(int[] price, int discount, int offset,int readLength){
        if (price == null || price.length == 0 || discount < 1 || discount > 99 || offset < 0 || readLength < 1)
            throw  new IllegalArgumentException("Wrong data"); //проверки на корректность данных
        int max = readLength + offset;
        int[] result = new int[readLength];
        for (int i = offset; i < max && i < price.length; i++){ //даже если readLength больше длины массива,
            // корректо обрабатываем пока не кончится массив
            result[i - offset] = (int) Math.floor(price[i] * (100 - discount) * 0.01);
        }
        return result;
    }
}
