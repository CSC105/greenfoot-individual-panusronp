import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startbutton extends Actor
{
    GreenfootSound startsong;
    GreenfootImage start1=new GreenfootImage("startbutton1.png");
    /**
     * Act - do whatever the startbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public startbutton () {
        startsong = new GreenfootSound("sounds/startsong.mp3");
        GreenfootImage start1=new GreenfootImage("startbutton1.png");
        startsong.playLoop();
    }
    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            startsong.stop();
            Greenfoot.setWorld(new MyWorld());
        }
    }  
}
