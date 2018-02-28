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
    /**
     * Act - do whatever the startbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public startbutton () {
        startsong = new GreenfootSound("sounds/startsong.mp3");
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
