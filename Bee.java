import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    double dy = 0;
    double gplus = 0.5;
    double SPEEDUP = -7;
    int counter = 0, c = 1;
    
    public Bee(){
        
    }
    
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animateBird();
        gameOver();
        beeJump();
    }
    
    public void animateBird(){
        counter++;
        c++;
        if (c<=30){
            if (c%10 == 0){
                setImage("flappybird" + c/10 + ".png");
            }
        } else{
            c = 1;
        }
        
    }
        
    public void beeJump(){
        setLocation(getX(), (int)(getY() + dy));
        if (Greenfoot.isKeyDown("space") || Greenfoot.mousePressed(getWorld())){
            dy = SPEEDUP;
        }
            
            if (dy > -16 && dy < -5){
                setRotation(-30);   //face up
            } else if (dy > 3){
            setRotation(40);    //face down
        } else if (dy > -5 && dy < 2){
            setRotation(0);     //straight
        }
        
        
        dy = dy + gplus;
    }
    
    public void gameOver(){
        
        if (getOneIntersectingObject(Ground.class) != null ||
        getOneIntersectingObject(Pipe.class) != null ||
        getOneIntersectingObject(PipeTop.class) != null){
            Stop gameOver = new Stop();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }

    }
    
    public void restartGame(){
        
    }
}
