import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound startsong;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1, true);
        flamingo flamingo=new flamingo();
        restart restart=new restart();
        home home=new home();
        Score Score=new Score();
        addObject(flamingo,1200/2,555);
        addObject(Score,1020,30);
        addObject(restart,36,35);
        addObject(home,36,102);
        startsong = new GreenfootSound("sounds/stage.mp3");
        Score.score=0;
    }

    public void act(){
        if(Greenfoot.getRandomNumber(70)<3){
            apple apple=new apple();
            addObject(apple,Greenfoot.getRandomNumber(getWidth()),0);
        }else if(Greenfoot.getRandomNumber(100)<3){
            bomb bomb=new bomb();
            addObject(bomb,Greenfoot.getRandomNumber(getWidth()),0);
        }else if(Greenfoot.getRandomNumber(130)<3){
            carrot carrot=new carrot();
            addObject(carrot,Greenfoot.getRandomNumber(getWidth()),0);
        }else if(Greenfoot.getRandomNumber(120)<3){
            beetroot beetroot=new beetroot();
            addObject(beetroot,Greenfoot.getRandomNumber(getWidth()),0);
        }else if(Greenfoot.getRandomNumber(110)<3){
            shrimp shrimp=new shrimp();
            addObject(shrimp,Greenfoot.getRandomNumber(getWidth()),0);
    }
    startsong.playLoop();
}


//@Override
//public void act(){
//    startsong.playLoop();
//}
//@Override
//public void stopped(){
 // startsong.stop();
//}
}



