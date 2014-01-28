/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class Beetle extends Insect
{
    private int k = printInit("Beetle.k initialized");

    public Beetle()
    {
        System.out.println("Beetle  -  k=" + k);
        System.out.println("Beetle  -  j=" + j);
    }

    private static int x2 = printInit("Beetle  -  static Beetle.k initialized");

    //Check the order of initialization. 
    public static void main(String[] args)
    {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }

    {
        printInit("Beetle block");
    }

    static
    {
        printInit("Beetle static block");
    }
}
