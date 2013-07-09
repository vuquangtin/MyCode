/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterOne;

public class AllisObject
{
    public static void main(String[] args)
    {
        String[] str = new String[3];
        System.out.println(str[1]);
    }

    public void TestOne()
    {
        //        int x = 0;
        AllisObject obj = new AllisObject();

        System.out.println(obj.getX() == 0);
    }
    
    private static int x;

    public static int getX()
    {
        return x;
    }
}
