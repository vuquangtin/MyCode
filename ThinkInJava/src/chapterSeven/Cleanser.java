/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class Cleanser
{
    private String s = "Cleanser ";

    public void append(String a)
    {
        s += a;
    }

    public void dilute()
    {
        append(" dilute()\t");
    }

    public void apply()
    {
        append(" -apply()\t");
    }

    public void scrub()
    {
        append(" scrub()\t");
    }

    public String toString()
    {
        return s;
    }

    public static void main(String[] args)
    {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
