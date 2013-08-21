/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class Detergent extends Cleanser
{
    public void scrub()
    {
        append(" Detergent.scrub()\t");
        super.scrub();
    }

    public void foam()
    {
        append(" foam()\t");
    }

    public static void main(String[] args)
    {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println(" Testing base class:\t");
        Cleanser.main(args);
    }
}
