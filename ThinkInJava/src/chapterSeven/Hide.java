/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class Hide
{
    public static void main(String[] args)
    {
        Bart b = new Bart();
        b.doh(1);
        b.doh('c');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
