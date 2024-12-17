import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Zombie()
    {
        getImage().scale(100,100);
    }
    
    public void act()
    {
        moveFromRight();
        removeZombie();
    }
    
    public void moveFromRight()
    {
        move(-5); // speed of zombie
    }
    
    public boolean checkMovement() //shooter dies if zombie reaches close
    {
        if(getX() <= 150)  // checking if x <= 150 to remove zombie after it reaches that point close to shooter
            return true;
        if(getX() >= getWorld().getWidth() - 1 || getY() <= 0 || getY() >= getWorld().getHeight() - 1)
            return true;
        else
            return false;
    }
    
    public void removeZombie() //removing zombie and showing text if if zombie reches close to shooter at x <= 200
    {
        if (checkMovement()) 
        {
            getWorld().showText("YOU ARE DEAD, BUT ATLEAST YOU KILLED SOME...", 450, 300);
            Greenfoot.stop();
            getWorld().removeObject(this);
        }
    }
}
