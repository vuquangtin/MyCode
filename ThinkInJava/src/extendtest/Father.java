/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package extendtest;

public class Father
{
    public String str = "Father - str";

    public static String strTwo = "Father - strTwo";

    public Father()
    {
        System.out.println("Father - str:" + str + "\tFather - strTwo:" + strTwo);
        drink();
        eat();
    }

    public static void eat()
    {
        System.out.println("Father - eat");
    }

    public void drink()
    {
        System.out.println("Father - drink");
    }
    
    public String setFather(String name)
    {
        return "";
    }

    static
    {
        System.out.println("Father - static block");
    }
    
    {
        System.out.println("Father - block");
    }

    public static void main(String[] args)
    {
        Father father = new Father();
        Father father2 = new Father();
    }
}
