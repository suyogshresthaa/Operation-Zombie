import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shooter extends Actor
{
    /**
     * Act - do whatever the Shooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int fireTime = 0; //variable for couting the time until fire
    
    public Shooter()
    {
        getImage().scale(120,120);
    }
    
    public void act()
    {
        moveShooter();
    }
    
    public void moveShooter() //keyboard functions to move zombie
    {
        int x = getX();
        int y = getY();
    
        if (Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("Up"))
        {
            y-=3;
        }
        if (Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("Down"))
        {
            y+=3;
        }
        if (y < 230) // shooter cannot go more up than this
        {
            y = 230;
        }
        if (y > 530) // shooter cannot go more down than this
        {
            y = 530;
        }
        if ("space".equals(Greenfoot.getKey()) && fireTime == 0) //can only shoot when firetime is 0 to restrict user abuse of spamming the space button to fire constantly
        {
            fire();
            Greenfoot.playSound("shot.wav");
            fireTime = 30; //resettig fire time (half a second)
        }
        setLocation(x,y);
        if (fireTime > 0) // cannot shoot
        {
            fireTime--;
        }
    }
    
    public void fire()
    {
        Bullet b = new Bullet();
        getWorld().addObject(b, getX() + 50, getY() - 38); //firing bullet from the exact position of the gun
    }
}
