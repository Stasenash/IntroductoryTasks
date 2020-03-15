package com.example.task2;

import com.sun.istack.internal.Nullable;

public class Task2Main {

    public static void main(String[] args) {
    }

    /**
     * Метод "скидка". Применяет скидку discount к цене price, начиная с позиции offset
     * на количество позиций readLength. Новые цены округляем “вниз”,
     * до меньшего целого числа.  * @param price - исходные цены.
     * @param discount - % скидки, от 1 до 99.
     * @param offset - номер позиции, с которой нужно применить скидку.
     * @param readLength - количество позиций, к которым нужно применить скидку.
     * @return - массив новых цен.
     */

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
