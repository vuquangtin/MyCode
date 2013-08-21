/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package extendtest;

import java.util.ArrayList;
import java.util.List;

public class TomTest
{
    public static void main(String[] args)
    {
        ClassTwo two = new ClassTwo();
        two.setCompany("company");
        two.setEmail("email");
        two.setName("name");

        List<ClassTwo> list = new ArrayList<ClassTwo>();
        list.add(two);

        ClassOne one = new ClassOne();
        List<ClassOne> list2 = one.getList(list);
        for (ClassOne one2 : list2)
        {
            ClassTwo two2 = (ClassTwo)one2;
            System.out.println(two2.getCompany());
        }
        System.out.println(list2.toString());
    }
}
