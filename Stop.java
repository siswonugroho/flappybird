import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stop extends Actor
{
    /**
     * Act - do whatever the Stop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Stop(){
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new StartPage());
    }
    
    public void act() 
    {
        
    }    
}
