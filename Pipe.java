import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe extends Actor
{
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int pipeSpeed = -3;
    
    public void act() 
    {
        movePipes();
    }    
    
    public void movePipes(){
        move(pipeSpeed);
        if (getX() < getWorld().getWidth() * -1){
            getWorld().removeObject(this);
        }
    }
}
