import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dX = 7;
    private int dY = 4;
    
    
    
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        checkForBounce();
        checkForCollision();
    }
    
    public void move()
    {
        setLocation(getX() + dX, getY() + dY);
    }
   
    public void checkForBounce()
    {
        if (getX() <= 0 || getX() >= getWorld().getWidth()-1)
        {
            dX = -dX;
        }
        
        if (getY() <= 0 || getY() >= getWorld().getHeight()-1)
        {
            dY = -dY;
        }
        
    }
    
    public void checkForCollision()
    {
        if(isTouching(rightbar.class))
        {
            dX = -dX;
        }
    }
    
    
    
    
    
}
