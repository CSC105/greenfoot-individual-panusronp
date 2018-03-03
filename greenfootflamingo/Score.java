import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
 
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    //int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score=0;
    public Score(){
        //setImage(new GreenfootImage("" , 44, Color.RED, new Color(0,0,0,100)));
    }
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + Score.score, 44, Color.YELLOW, new Color(0,0,0,0)));
    }    
   
}