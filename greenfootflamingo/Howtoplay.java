import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Howtoplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Howtoplay extends World
{

    /**
     * Constructor for objects of class Howtoplay.
     * 
     */
    public Howtoplay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1);
        home home=new home();
        addObject(home,1164,634);
    }
}
