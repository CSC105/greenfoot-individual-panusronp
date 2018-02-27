import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

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
        Score Score=new Score();
        addObject(flamingo,1200/2,555);
        addObject(Score,1020,30);
        addObject(restart,46,43);
      
    }

    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            apple apple=new apple();
            addObject(apple,Greenfoot.getRandomNumber(getWidth()),0);
        }else if(Greenfoot.getRandomNumber(75)<1){
            bomb bomb=new bomb();
            addObject(bomb,Greenfoot.getRandomNumber(getWidth()),0);
        }else if(Greenfoot.getRandomNumber(70)<1){
            carrot carrot=new carrot();
            addObject(carrot,Greenfoot.getRandomNumber(getWidth()),0);
        }else if(Greenfoot.getRandomNumber(70)<1){
            beetroot beetroot=new beetroot();
            addObject(beetroot,Greenfoot.getRandomNumber(getWidth()),0);
        }else if(Greenfoot.getRandomNumber(70)<1){
            shrimp shrimp=new shrimp();
            addObject(shrimp,Greenfoot.getRandomNumber(getWidth()),0);
    }

    
}

}

