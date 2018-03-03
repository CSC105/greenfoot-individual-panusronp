import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple extends Actor
{
    GreenfootImage splash=new GreenfootImage("splash.png");
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    public apple(){
    GreenfootImage apple=new GreenfootImage("apple.png");
    setImage(apple);
}
    
        
    public void act() 
    {
       applefall();
}
public void applefall(){
    if(getY()<=605){
            setLocation(getX(),getY()+5);
        }

        if(this.getY()>=605){
            count++;
            this.setImage(splash);
        }
        
        if(count==15){
            getWorld().removeObject(this);
            count=0;
    }  
}
}
