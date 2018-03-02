import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snow2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snow2 extends Actor
{
    /**
     * Act - do whatever the snow2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       snow2fall();
}
public void snow2fall(){
    if(getY()<=675){
            setLocation(getX(),getY()+3);
        }
            if(this.getY()>=674){
            getWorld().removeObject(this);
        }
    }
}

