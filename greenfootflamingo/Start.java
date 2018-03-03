import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    GreenfootSound startsong; 
    /**
     * Constructor for objects of class start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1);
        startbutton startbutton=new startbutton();
        //htpbutton htpbutton=new htpbutton();
        logo logo=new logo();
        addObject(startbutton,306,156);
        //addObject(htpbutton,507,466);
        addObject(logo,849,446);
        //startsong = new GreenfootSound("sounds/startsong.mp3");
        //Greenfoot.playSound("sounds/startsong.mp3");
        Greenfoot.start();
        //startsong.playLoop();
    }
    public void act(){
        if(Greenfoot.getRandomNumber(15)<1){
            snow1 snow1=new snow1();
            addObject(snow1,Greenfoot.getRandomNumber(getWidth()),0);
        }else if(Greenfoot.getRandomNumber(10)<1){
            snow2 snow2=new snow2();
            addObject(snow2,Greenfoot.getRandomNumber(getWidth()),0);
        }
        

}
}



