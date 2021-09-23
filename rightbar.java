import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rightbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rightbar extends Actor
{
    private int moveup = -8;
    private int movedown = 8;
    
    
    /**
     * Act - do whatever the rightbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkForKeys();
    }
    
    
    
    public void checkForKeys()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() + moveup);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + movedown);
        }
    }

    
}   
