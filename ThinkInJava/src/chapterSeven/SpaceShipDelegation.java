/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class SpaceShipDelegation
{
    private String name;

    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name)
    {
        this.name = name;
    }

    //Eclipse can generate following methodss. 
    void up(int velocity)
    {
        controls.up(velocity);
    }

    void down(int velocity)
    {
        controls.down(velocity);
    }

    void left(int velocity)
    {
        controls.left(velocity);
    }

    void right(int velocity)
    {
        controls.right(velocity);
    }

    void forward(int velocity)
    {
        controls.forward(velocity);
    }

    void back(int velocity)
    {
        controls.back(velocity);
    }

    void turboBoost()
    {
        controls.turboBoost();
    }

    public static void main(String[] args)
    {
        SpaceShipDelegation delegation = new SpaceShipDelegation("NSEA Protector");
        delegation.forward(100);
    }
}
