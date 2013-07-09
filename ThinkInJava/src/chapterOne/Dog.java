/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterOne;

public class Dog
{
    public String name;

    public String says;

    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.name = "spot";
        dog.says = "Ruff!";
        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        System.out.println(dog.toString() + dog2.toString());
        Dog dog3 = new Dog();
        dog3.name = "spot";
        dog3.says = "Ruff!";
        System.out.println(dog == dog3);
        System.out.println(dog.equals(dog3));

        System.out.println("i || j is " + (true && true));
    }

    public String toString()
    {
        return "name:" + name + "\tsays:" + says + "\n";
    }
}
