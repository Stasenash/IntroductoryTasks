package com.example.task2;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testCanDoSimpleTask(){
        Assert.assertArrayEquals("Проверка массива из \"дано\"",new int[] {50, 10, 33},Task2Main.decryptData(new int[]{5,100,20,66,16},50,1,3));
    }


    @Test
    public void testWrongDiscount(){
        try {
            Task2Main.decryptData(new int[]{10,12,35},100,0,2);
            Assert.fail("Fail because exception was not thrown. Wrong discount");
        }catch (IllegalArgumentException e) {
            //true;
        }

        try {
            Task2Main.decryptData(new int[]{10,12,35},99,0,-1);
            Assert.fail("Fail because exception was not thrown. Wrong readLength");
        }catch (IllegalArgumentException e){
            //true;
        }


        try {
            Task2Main.decryptData(new int[]{10,12,35},99,-20,5);
            Assert.fail("Fail because exception was not thrown. Wrong offset");
        }catch (IllegalArgumentException e){
            //true;
        }

        try {
            Task2Main.decryptData(new int[]{},90,0,5);
            Assert.fail("Fail because exception was not thrown. Array length = 0");
        }catch (IllegalArgumentException e){
            //true;
        }

        try {
            Task2Main.decryptData(null,50,0,3);
            Assert.fail("Fail because exception was not thrown. Array is null");
        }catch (IllegalArgumentException e){
            //true;
        }
    }
}
