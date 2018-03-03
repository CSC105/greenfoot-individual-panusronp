import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    GreenfootImage boom=new GreenfootImage("boom.png");
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count =0;
   public bomb(){
    GreenfootImage bomb = new GreenfootImage("bomb.png");
    setImage(bomb);
    
    }
    public void act() 
    {
              boomfall(); 
    }

public void boomfall(){
     if(getY()<= 605){
        setLocation(getX(),getY()+7);
    }
    
        if(this.getY()>=605){
            count++;
            this.setImage(boom);
        }
        
        if(count == 15){
           getWorld().removeObject(this);
           count =0;
          } 
            

}

}

