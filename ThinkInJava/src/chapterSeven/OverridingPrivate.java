/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class OverridingPrivate extends WithFinals
{
    private final void f()
    {
        System.out.println("OverridingPrivate.f()");
    }

    private void g()
    {
        System.out.println("OverridingPrivate.g()");
    }
}
