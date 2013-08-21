/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package extendtest;

public class Sun// extends Father
{
    //public String str = eat("sun - str2");

    public String str2 = null;

    //public String str3 = eat(str + "  str3");

    public Sun()
    {
        //System.out.println("sun - str:" + str + "\tsun - strTwo:" + strTwo + "\tsun - str3:" + str3);
        System.out.println(str2);
        drink();
        //drink();
        //                eat2();
    }

    public void drink()
    {
        System.out.println(str2);
        //System.out.println("sun - drink");
    }

    //    static
    //    {
    //        System.out.println("sun - static block");
    //    }

    public static String eat(String str)
    {
        System.out.println(str);
        eat2("eat2");
        return "sun - eat";
    }

    public static void eat2(String str)
    {
        System.out.println(str);
    }

    //public static String strTwo = eat("sun - str2Two");
    
    //    {
    //        System.out.println("sun - block");
    //    }

    public static void main(String[] args)
    {
        Sun sun = new Sun();
        //Sun sun2 = new Sun();
    }
}
