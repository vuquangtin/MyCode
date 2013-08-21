/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class Root
{

    Root()
    {
        System.out.println("Root Constructor");
    }
    ComponentOne one = new ComponentOne();

    ComponentThree three = new ComponentThree();

    ComponentTwo two = new ComponentTwo();

    public static void main(String[] args)
    {
        Root root = new Root();
    }
}
