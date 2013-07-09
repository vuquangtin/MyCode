/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterOne;

public class ExerciseOne
{
    public static int num;

    public char chr;

    public static void main(String[] args)
    {
        System.out.println(ExerciseOne.num);
        ExerciseOne.addNum();
        ExerciseOne.addNum2();
        System.out.println(ExerciseOne.num);
    }

    public static void addNum()
    {
        num++;
    }

    public static void addNum2()
    {
        num++;
    }
}
