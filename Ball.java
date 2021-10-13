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
    private int p1Score = 0;
    private int p2Score = 0;
    private int startDelay = 0;
    private boolean musicPlayed;
    private GreenfootSound music = new GreenfootSound("music.mp3");
    
    
    
    
    
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        startDelay++;
        move();
        checkForBounce();
        checkForCollision();
        resetBall();
        endGame();
        playMusic();
    }
    public void move()
    {
        if(startDelay>= 10)
        {
            setImage("sans.png");
        }      
        if(startDelay>= 40)
        {
            setLocation(getX() + dX, getY() + dY);
        }
    }
    public void playMusic()
    {
        if(!music.isPlaying())
        {
            music.playLoop();
            musicPlayed = true;
        }
    }
    
    
    /**
     * Makes the ball bounce off the walls
     */
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
    /**
     * Makes ball collide with the paddles
     */
    public void checkForCollision()
    {
        if(isTouching(Bar.class) && getX()<= 100)
        {            
            dX = 10;
            move();
            dX = 7;
            Greenfoot.playSound("Damage.mp3");
        } 
        if(isTouching(Bar.class) && getX()>= 800)
        {            
            dX = -10;
            move();
            dX = -7;
            Greenfoot.playSound("Damage.mp3");
        }    
    }
    /**
     * Resets ball and adds score to whichever side scores 
     */
    public void resetBall()
    {
        if (getX() >= getWorld().getWidth()-1)
        {
            setLocation(450, 300);
            p2Score++;
            startDelay = 0;
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.p2score();
            Greenfoot.playSound("Swoosh.mp3");
        }
        if(getX() <= 0)
        {
            p1Score++;
            startDelay = 0;
            setLocation(450, 300);
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.p1score();
            Greenfoot.playSound("Swoosh.mp3");
        }
    }
    /**
     * ends the game at 8 points
     */
    public void endGame()
    {
        if(p1Score >= 8)
        {           
            setLocation(450,300);
            setImage("p1.jpg");
            Greenfoot.playSound("player1wins.mp3");
            music.stop();
            Greenfoot.stop();
        }
        if(p2Score >= 8)
        {
            setLocation(450,300);
            setImage("p2.jpg");
            Greenfoot.playSound("player2wins.mp3");
            music.stop();
            Greenfoot.stop();
        }
    }
    }
    
    
    
    
    
    

