/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class Frog extends Amphibian
{
    public void play(Amphibian a)
    {
        System.out.println("frog");
    }

    public static void main(String[] args)
    {
        Amphibian frog = new Frog();
        //        Amphibian.play(frog);
        frog.play(frog);
    }
}
