import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    //Create scoreboard at the top + format (font)
    private int score;
    /**
     * Call any method in it
     */
    public void act()
    {
       
    }
    /**
     * Create a new counter, initialised to 0.
     */
    public Counter()
    {
        score = 0;
        setImage (new GreenfootImage(200,30));
        update();
    }
    /**
     * Adds Score 
     */
    public void addScore()
    {
        score++;
        update();
    }
    /**
     * Changes image when Score is added
     */
    public void update()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.WHITE);
        img.drawString("Score: " + score, 4, 20);
        
    }
    
}
