import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnterScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnterScreen extends World
{

    /**
     * Constructor for objects of class EnterScreen.
     * 
     */
    
    public EnterScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }

    public void act()
    {
        showBegin1();
        yesNo();
    }

    public void showBegin1()
    {
        showText("WELCOME TO SHOOTER VS ZOMBIE", 450, 230);
        showText("PRESS W OR UP BUTTON TO MOVE THE SHOOTER UPWARDS.", 450, 300);
        showText("PRESS S OR DOWN BUTTON TO MOVE THE SHOOTER DOWNWARDS.", 450, 330);
        showText("PRESS SPACE BUTTON TO SHOOT.", 450, 360);
        showText("LET'S PLAY NOW, SHALL WE? (Y/N) ", 450, 450);
    }
    
    public void yesNo()
    {
        if (Greenfoot.isKeyDown("Y"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        if (Greenfoot.isKeyDown("N"))
        {
            Greenfoot.stop();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() // this is how the screen starts
    {
        Shooter shooter = new Shooter();
        addObject(shooter,226,412);
        shooter.setLocation(63,486);
    }
}
