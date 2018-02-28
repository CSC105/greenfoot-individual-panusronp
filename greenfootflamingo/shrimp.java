import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shrimp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shrimp extends Actor
{
    /**
     * Act - do whatever the shrimp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    public shrimp(){
    GreenfootImage shrimp=new GreenfootImage("shrimp.png");
    setImage(shrimp);
}
    public void act() 
    {
        if(getY()<=605){
            setLocation(getX(),getY()+5);
            
        }if(this.getY()>=605){
            getWorld().removeObject(this);
            //this.setImage(shrimp);
        }//if(count==15){
           // getWorld().removeObject(this);
            //count=0;
    //}  
    }   
}
