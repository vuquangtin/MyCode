/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class Instrument
{
    public void play()
    {
        System.out.println(this.getClass());
    }

    static void tune(Instrument i)
    {
        i.play();
    }
}
