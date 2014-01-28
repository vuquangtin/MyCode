/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package extendtest;

public class DownstreamCast
{
    public static void main(String[] args)
    {
        Child child = new Child();
        child.num = 10;
        System.out.println(child.num);
        FatherTwo two = child;

        Child childTwo = (Child)two;
        System.out.println(childTwo.num);
    }
}

class FatherTwo
{
    String getFather()
    {
        return "FatherTwo";
    }
}

class Child extends FatherTwo
{
    public Integer num = 0;

    String getFather()
    {
        return "Child" + num;
    }
}