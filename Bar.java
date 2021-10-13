import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rightbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bar extends Actor
{
    private int moveup = -8;
    private int movedown = 8;
    private String upKey;
    private String downKey;
    
    /**
     * Change key Inputs
     */
    
    
    public Bar(String upKey,String downKey)
    {
        this.upKey = upKey;
        this.downKey = downKey;
    }
    
    
    
    
    /**
     * Act - do whatever the rightbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkForKeys();
    }
    
    
    /**
     * Checks if keys are down
     */
    public void checkForKeys()
    {
        if (Greenfoot.isKeyDown(upKey))
        {
            setLocation(getX(), getY() + moveup);
        }
        if (Greenfoot.isKeyDown(downKey))
        {
            setLocation(getX(), getY() + movedown);
        }
    }

    
}   
