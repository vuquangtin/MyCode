/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package com.hp.nio;

import java.nio.CharBuffer;

public class BufferFillDrain
{
    public static void main(String[] args)
    {
        CharBuffer buffer = CharBuffer.allocate(100);
        while(fillBuffer(buffer)) {
            buffer.flip();
            drainBuffer(buffer);
            buffer.clear();
        }
    }

    private static void drainBuffer(CharBuffer buffer)
    {
        while (buffer.hasRemaining())
        {
            System.out.println(buffer.get());
        }
        System.out.println("");
    }

    private static boolean fillBuffer(CharBuffer buffer)
    {
        if (index >= strings.length)
        {
            return (false);
        }
        String string = strings[index++];

        for (int i = 0; i < strings.length; i++)
        {
            buffer.put(string.charAt(i));
        }
        return (true);
    }

    private static int index = 0;

    private static String[] strings = {"A random string value", "The product of an infinite number of monkeys",
            "Hey hey we'er the Monkees", "Opening act for the Mokees: Jimi Hendrix", "Scuse me while I kiss this fly",
            "Help Me! Help Me!"};
}
