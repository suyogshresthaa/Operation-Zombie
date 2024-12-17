import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet()
    {
        getImage().scale(50,50);
    }
    
    public void act()
    {
        if (killZombie()) // Calling this method once per frame to remove bullet after hitting a zombie
        {
            return;  
        }
        move(8); //only executing this bullet movement if the method above returns nothing
        removeInEdge();
    }
    
    public boolean checkEdge() //checking if the bullet reaches the edge of the screen without hitting any zombie
    {
        if(getX() <= 0 || getX() >= getWorld().getWidth() - 1)
            return true;
        if(getY() <= 0 || getY() >= getWorld().getHeight() - 1)
            return true;
        else
            return false;
    }
    
    public void removeInEdge() // removing bullet if it reaches the edge of the screen
    {
        if (checkEdge())
        {
            getWorld().removeObject(this);
        }
    }
    
    public boolean killZombie() // removing zombie if bullet touches it
    {
        if (isTouching(Zombie.class))
        {
            removeTouching(Zombie.class);
            ((MyWorld)getWorld()).increaseZombieKilled(); //increasing the zombies killed in my world
            
            if (getWorld() != null)  // checking if bullet is in the world
            {
                getWorld().removeObject(this);  // removing this bullet
            }
            return true; // indicating zombie is killed and bullet removed
        }
        return false; // indicating no zombie is killed
    }
}
