import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snow1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snow1 extends Actor
{
    /**
     * Act - do whatever the snow1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       snow1fall();
}
public void snow1fall(){
    if(getY()<=675){
            setLocation(getX(),getY()+7);
        }
            if(this.getY()>=674){
            getWorld().removeObject(this);
        }
    }
}
