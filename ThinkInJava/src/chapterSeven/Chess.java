/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class Chess extends BoardGame
{
    Chess()
    {
        super(11);//This is not required because of empty constructor
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args)
    {
        Chess chess = new Chess();
    }
}
