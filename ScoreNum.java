import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreNum extends Actor
{
    /**
     * Act - do whatever the ScoreNum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public ScoreNum(){
        GreenfootImage scoreBg = new GreenfootImage(100, 50);
        setImage(scoreBg);
    }
    
    public void act() 
    {
        // Add your action code here.
    } 
    
    public void setScore(int score){
        GreenfootImage scoreBg = getImage();
        scoreBg.clear();
        Font f = new Font("Arial", true, false, 20);
        scoreBg.setFont(f);
        scoreBg.drawString("" + score, scoreBg.getWidth()/2-3, scoreBg.getHeight()/2+8);
        //scoreBg.scale(scoreBg.getWidth()-4, scoreBg.getHeight()+10);
        setImage(scoreBg);
        
    
    }
    
}
