/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterOne;


public class Incrementable
{
    static int i;

    public float alias;

    public String str;

    public void changeAlias(float alias)
    {
        this.alias = 10;
    }
    /**
     *  {@link chapterOne.AllisObject}
     *  {@docRoot}
     *  {@inheritDoc}
     *  @version 2.3.1
     *  @see AllisObject
     *  @author guanc
     *  @since 1.5.0
     */
    static void Increment()
    {
        Incrementable.i++;
    }

    public static void main(String[] args)
    {
        //Random rand = new Random(50);
//        System.out.println(rand.nextInt());

        /*System.out.println("ab" == "ab");
        System.out.println(new String("abc") == new String("abc"));
        Incrementable table = new Incrementable();
        table.setStr("abc");
        System.out.println(table.getStr() == "abc");
        System.out.println(new Integer(10) == new Integer(10));*/
        
        Incrementable table = new Incrementable();
        Incrementable table2 = new Incrementable();
        table.i = table2.i = 20;
        System.out.println(table.equals(table2));
    }

    /**
     * 
     * Description goes here.
     *
     * @param sign
     * @return
     * @throws Exception description
     * @deprecated
     */
    public String doclet(String sign)
        throws Exception
    {
        return "test";
    }

    public final String getStr()
    {
        return str;
    }

    public final void setStr(String str)
    {
        this.str = str;
    }
    
    public boolean equals(Object obj)
    {
        if (obj instanceof Incrementable)
        {
            return i == ((Incrementable)obj).i;
        }
        return false;
        }
}
