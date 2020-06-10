import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        setPaintOrder(Stop.class, ScoreNum.class, Score.class, Ground.class, Bee.class, PipeTop.class, Pipe.class);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Bee bee = new Bee();
        addObject(bee,184,114);
        bee.setLocation(140,160);
        ground = new Ground();
        addObject(ground, getWidth()/2, getHeight()-15);
        showHud();
    }
    
    public void act(){
        createPipeAndScore();
        connectGround();
    }
    
    int times = 0;
    int timesToScore = 255;
    int score = 0;
    int nextScoreTimes = 0;
    int timesToNewGround = 0;
    ScoreNum scoreBoard = null;
    Ground ground = null;
    Score scoreBg = null;
    //boolean isPaused = true;
    
    private void createPipeAndScore(){
        
        times++;
        
        if (times % 100 == 0){
            int pipe_offset = Greenfoot.getRandomNumber(40)*2;
            Pipe bottompipe = new Pipe();
            PipeTop toppipe = new PipeTop();
            addObject(bottompipe, getWidth() + 50, getHeight() - 50 + pipe_offset);
            addObject(toppipe, getWidth() + 50, 0 - 50 + pipe_offset);
            
            
        }
        
        
        if (times >= timesToScore){
            if (nextScoreTimes % 100 == 0){
                score++;
                scoreBoard.setScore(score);
            }
            nextScoreTimes++;
        }
    }
    
    public void connectGround(){
        if (ground.getX() == getWidth()/2){
            ground = new Ground();
            addObject(ground, getWidth(), getHeight()-15);
        }
    }
    
    
    
    public void showHud(){
        scoreBoard = new ScoreNum();
        addObject(scoreBoard, getWidth()/2, 50);
        scoreBoard.setScore(0);
            
        scoreBg = new Score();
        addObject(scoreBg, getWidth()/2, 50);
        
        
    }
    
    /*public void startGame(){
        if (Greenfoot.mouseClicked(startText) || Greenfoot.isKeyDown("space")){
            isPaused = false;
            showHud();
        } else{
            isPaused = true;
            showTitle();
        }
    }*/
    
}
