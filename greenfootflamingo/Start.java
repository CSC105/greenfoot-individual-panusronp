import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    /**
     * Constructor for objects of class start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1);
        startbutton startbutton=new startbutton();
        htpbutton htpbutton=new htpbutton();
        addObject(startbutton,605,155);
        addObject(htpbutton,743,440);
        
        Greenfoot.playSound("sounds/startsong.mp3");
    }
    
}
