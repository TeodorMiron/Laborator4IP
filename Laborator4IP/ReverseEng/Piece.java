// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Piece.java

package com.company;

import java.util.Vector;

public class Piece
{

    public Piece()
    {
    }

    public String getColor()
    {
        return color;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    public String color;
    public String position;
    public String status;
    public String name;
    public Vector myBoard;
}
