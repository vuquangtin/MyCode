/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterOne;


public class BitwiseExample
{
    public static void main(String[] args)
    {
        Integer i = new Integer(40);
        System.out.println(true ^ true);
        System.out.println(true);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i <<= 1);
        System.out.println(i >>>= 2);
        System.out.println(Integer.toBinaryString(i >>= 1));

        System.out.println("------------------------------");

        int i2 = -2;
        System.out.println(Integer.toBinaryString(i2));
        System.out.println(Long.toBinaryString(i2));
        System.out.println(Double.toHexString(i2));
        System.out.println("------------------------------");
        System.out.println(Integer.toBinaryString(-1172028779));
        System.out.println(" " + Integer.toBinaryString(1717241110));
        System.out.println("  " + Integer.toBinaryString(-1172028779 & 1717241110));
        System.out.println(Integer.toBinaryString(-1172028779 | 1717241110));
        System.out.println(Integer.toBinaryString(-1172028779 ^ 1717241110));
        System.out.println("------------------------------");
        System.out.println(Integer.toBinaryString('a'));
    }
}
