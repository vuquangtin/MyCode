/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class OverridingPublic extends OverridingPrivate
{
    public final void f()
    {
        System.out.println("OverridingPublic.f()");
    }

    public void g()
    {
        System.out.println("OverridingPublic.g()");
    }
}
