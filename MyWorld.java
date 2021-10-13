import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Counter counter;
    private Counter counter2;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    
        super(900, 600, 1); 
        setBackground("download_900x600.png");
        Ball ball = new Ball();
        addObject(ball, getWidth()/2, getHeight()/2);
        
        
        Bar rightbar = new Bar("up","down");
        addObject(rightbar, getWidth() - 20, getHeight()/2);
        
        Bar leftbar = new Bar("w","s");
        addObject(leftbar, getWidth() - 880, getHeight()/2);
        
        counter = new Counter();
        addObject(counter, getWidth(), getHeight()-580);
        
        
        counter2 = new Counter();
        addObject(counter2, getWidth()-750, getHeight()-580);
        Greenfoot.start();
    }
    /**
     * Keeps track of the score For Player 2
     */
    public void p2score()
    {
        counter.addScore();
    }
    /**
     * Keeps track of the score for Player 1
     */
    public void p1score()
    {
        counter2.addScore();
    }
        
    
    
    
}
