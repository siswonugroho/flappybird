import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveGround();
    }
    
    int groundSpeed = -3;
    int counter = 0;
    int c = 1;
    
    public void moveGround(){
        move(groundSpeed);
        if (getX() < getWorld().getWidth() * -1){
            getWorld().removeObject(this);
        }
    }
    
    
}
