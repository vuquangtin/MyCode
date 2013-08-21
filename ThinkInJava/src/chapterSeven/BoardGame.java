/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package chapterSeven;

public class BoardGame extends Game
{
    BoardGame()
    {
        super(1);
    }

    BoardGame(int i)
    {
        super(i); //This is required. 
        System.out.println("BoardGame Constructor");
    }
}
