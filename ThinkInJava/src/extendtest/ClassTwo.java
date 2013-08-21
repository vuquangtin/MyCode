/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package extendtest;

public class ClassTwo extends ClassOne
{
    private String company;

    public final String getCompany()
    {
        return company;
    }

    public final void setCompany(String company)
    {
        this.company = company;
    }
}
