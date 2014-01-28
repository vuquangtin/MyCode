/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package extendtest;

import java.util.ArrayList;
import java.util.List;

public class ListCopyTest
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("guan");
        List<String> newList = new ArrayList<String>(list);
        //Collections.copy(newList, list);
        list.add("chen");
        System.out.println(newList);
    }
}
