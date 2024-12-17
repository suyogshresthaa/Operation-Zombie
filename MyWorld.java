import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int zombieKilled = 0;
    int countForRule = 0;
    int countZombie = 0;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
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

    public void act()
    {
        showZombieKilled();
        showRule();
        //increasnig the number of zombies by 2 than the difference of earlier level, every level
        if (zombieKilled <= 5)
        {
           showText("LEVEL 1", 450, 30);
           moveZombieLevel1(); 
        }
        
        if (zombieKilled >=5 && zombieKilled <=10)
        {
           showText("LEVEL 2", 450, 30);
           moveZombieLevel2(); 
        }
        
        if (zombieKilled >=10 && zombieKilled <=17)
        {
           showText("LEVEL 3", 450, 30);
           moveZombieLevel3(); 
        }
        
        if (zombieKilled >=17 && zombieKilled <=26)
        {
           showText("LEVEL 4", 450, 30);
           moveZombieLevel4(); 
        }
        
        if (zombieKilled >=26 && zombieKilled <=37)
        {
           showText("LEVEL 5", 450, 30);
           moveZombieLevel5(); 
        }
        
        if (zombieKilled >=37 && zombieKilled <=50)
        {
           showText("LEVEL 6", 450, 30);
           moveZombieLevel6(); 
        }
        
        if (zombieKilled >=54)
        {
           showText("YOU WIN, YOU CAN GO HOME SAFE NOW!!!", 450, 300);
           Greenfoot.stop();
        }
        
    }

    public void increaseZombieKilled()
    {
        zombieKilled++;
    }
    
    public void showZombieKilled()
    {
        showText("Zombies Killed: " + zombieKilled, 100, 30);
    }

    public void showRule()
    {
        countForRule++;
        if (countForRule > 5 && countForRule <= 150) // limiting the time to show this text
        {
            showText("LET'S KILL THEM ALL !!!!", 450, 300);
            showText("BUT DON'T LET THEM GET CLOSE TO YOU !!!!", 450, 330);
        }
        else
        {
            showText("", 450, 300); // showing no text after the time limit
            showText("", 450, 330);
        }
    }
    
    /* Creating levels to the game
     * interval between zombies appearing decreases
     * each level, zombies respawn faster
     */
    
    public void moveZombieLevel1()
    {
        countZombie++;
        if (countZombie > 170) // waiting a certain time before another zombie comes in
        {
            List<Zombie> zombies = getObjects(Zombie.class);
                Zombie z = new Zombie();
                addObject(z, getWidth()-1, Greenfoot.getRandomNumber(281) + 250); // generating zombies randomly between y=280 and y=530 so zombies appear only to the height the shooter can move up and down
                Greenfoot.playSound("zombie.wav");
            countZombie = 0; // resetting zombie count to 0 so that only one comes at a time otherwise a bunch comes together
        }
    }
    
    public void moveZombieLevel2()
    {
        countZombie++;
        if (countZombie > 140) // waiting a certain time before another zombie comes in
        {
            List<Zombie> zombies = getObjects(Zombie.class);
                Zombie z = new Zombie();
                addObject(z, getWidth()-1, Greenfoot.getRandomNumber(281) + 250); // generating zombies randomly between y=280 and y=530 so zombies appear only to the height the shooter can move up and down
                Greenfoot.playSound("zombie.wav");
            countZombie = 0; // resetting zombie count to 0 so that only one comes at a time otherwise a bunch comes together
        }
    }
    
    public void moveZombieLevel3()
    {
        countZombie++;
        if (countZombie > 110) // waiting a certain time before another zombie comes in
        {
            List<Zombie> zombies = getObjects(Zombie.class);
                Zombie z = new Zombie();
                addObject(z, getWidth()-1, Greenfoot.getRandomNumber(281) + 250); // generating zombies randomly between y=280 and y=530 so zombies appear only to the height the shooter can move up and down
                Greenfoot.playSound("zombie.wav");
            countZombie = 0; // resetting zombie count to 0 so that only one comes at a time otherwise a bunch comes together
        }
    }
    
    public void moveZombieLevel4()
    {
        countZombie++;
        if (countZombie > 80) // waiting a certain time before another zombie comes in
        {
            List<Zombie> zombies = getObjects(Zombie.class);
                Zombie z = new Zombie();
                addObject(z, getWidth()-1, Greenfoot.getRandomNumber(281) + 250); // generating zombies randomly between y=280 and y=530 so zombies appear only to the height the shooter can move up and down
                Greenfoot.playSound("zombie.wav");
            countZombie = 0; // resetting zombie count to 0 so that only one comes at a time otherwise a bunch comes together
        }
    }
    
    public void moveZombieLevel5()
    {
        countZombie++;
        if (countZombie > 60) // waiting a certain time before another zombie comes in
        {
            List<Zombie> zombies = getObjects(Zombie.class);
                Zombie z = new Zombie();
                addObject(z, getWidth()-1, Greenfoot.getRandomNumber(281) + 250); // generating zombies randomly between y=280 and y=530 so zombies appear only to the height the shooter can move up and down
                Greenfoot.playSound("zombie.wav");
            countZombie = 0; // resetting zombie count to 0 so that only one comes at a time otherwise a bunch comes together
        }
    }
    
    public void moveZombieLevel6()
    {
        countZombie++;
        if (countZombie > 45) // waiting a certain time before another zombie comes in
        {
            List<Zombie> zombies = getObjects(Zombie.class);
                Zombie z = new Zombie();
                addObject(z, getWidth()-1, Greenfoot.getRandomNumber(281) + 250); // generating zombies randomly between y=280 and y=530 so zombies appear only to the height the shooter can move up and down
                Greenfoot.playSound("zombie.wav");
            countZombie = 0; // resetting zombie count to 0 so that only one comes at a time otherwise a bunch comes together
        }
    }
}
