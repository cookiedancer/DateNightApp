import greenfoot.*;

/**
 * Write a description of class Amusement here.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross
 * @version 1.3
 */
public class Amusement extends Location
{
    /**
     * Act - do whatever the Amusement wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     if(Greenfoot.isKeyDown("Backspace"))
     getWorld().removeObject(this);
    }    
}
