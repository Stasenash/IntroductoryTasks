package com.example.task2;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testCanDoSimpleTask(){
        Assert.assertArrayEquals("Checking array from source data",new int[] {50, 10, 33},Task2Main.decryptData(new int[]{5,100,20,66,16},50,1,3));
        Assert.assertArrayEquals(new int[] {50,10,33,8,0,0,0}, Task2Main.decryptData(new int[]{5,100,20,66,16},50,1,7));
    }

    @Test
    public void testWrongData(){
        doExceptionsCheck(new int[]{10,12,35},100,0,2);
        doExceptionsCheck(new int[]{10,12,35},99,0,-1);
        doExceptionsCheck(new int[]{10,12,35},99,-20,5);
        doExceptionsCheck(new int[]{},90,0,5);
        doExceptionsCheck(null,50,0,3);
    }

    private void doExceptionsCheck(int[] price, int discount, int offset, int readLength ){
        try {
            Task2Main.decryptData(price, discount, offset, readLength);
            Assert.fail("Fail because exception was not thrown. Array is null");
        }catch (IllegalArgumentException e){
            //true;
        }
    }
}
