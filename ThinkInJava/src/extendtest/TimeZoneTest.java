/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package extendtest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
;

public class TimeZoneTest
{
    public static void main(String[] args)
    {
        String s = "2013-08-26 11:41:17.860";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        System.out.println("before setDefault TimeZone: " + timeZone.getDefault());
        timeZone.setDefault(timeZone);
        System.out.println("after setDefault TimeZone: " + timeZone.getDefault());
        df.setTimeZone(timeZone);
        Date date = null;
        try
        {
            date = df.parse(s);
            System.out.println(date.toString());
        }
        catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
