import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

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
        
        
        rightbar bar = new rightbar();
        addObject(bar, getWidth() - 20, getHeight()/2);
        
        rightbar bar2 = new rightbar();
        addObject(bar2, getWidth() - 880, getHeight()/2);
        
        
        
    }
}
