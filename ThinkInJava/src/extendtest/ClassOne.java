/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package extendtest;

import java.util.ArrayList;
import java.util.List;

public class ClassOne
{
    private String name;

    private String email;

    public final String getName()
    {
        return name;
    }

    public final void setName(String name)
    {
        this.name = name;
    }

    public final String getEmail()
    {
        return email;
    }

    public final void setEmail(String email)
    {
        this.email = email;
    }

    public List<ClassOne> getList(List<? extends ClassOne> list)
    {
        List<ClassOne> newList = new ArrayList<ClassOne>();
        for (ClassOne one : list)
        {
            newList.add(one);
        }
        return newList;
    }

}
