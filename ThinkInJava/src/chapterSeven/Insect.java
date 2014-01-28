/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class Insect
{
    private int i = 9;

    protected int j;

    Insect()
    {
        System.out.println("Insect  -  i=" + i + ",j=" + j);
        j = 39;
    }

    {
        printInit("Insect block");
    }



    static
    {
        x1 = 2;
        printInit("Insect static block");
    }

    private static int x1 = printInit("Insect  -  static Insect.x1 initialized");

    static int printInit(String s)
    {
        System.out.println(s);
        return 47;
    }
}
