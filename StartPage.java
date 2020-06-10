import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartPage extends World
{

    /**
     * Constructor for objects of class StartPage.
     * 
     */
    public StartPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        prepare();
    }

    
    public void showTitle(){
        GameTitle title = new GameTitle();

        addObject(title, getWidth()/2, 100);

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GameTitle gameTitle = new GameTitle();
        addObject(gameTitle,307,112);
        startButton startButton = new startButton();
        addObject(startButton,305,274);
        startButton.setLocation(312,206);
    }
    
    
}
