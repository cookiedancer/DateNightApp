import greenfoot.*;

/**
 * Write a description of class Adventure2 here.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross 
 * @version 1.3
 */
public class Adventure2 extends Random
{
    /**
     * Act - do whatever the Adventure2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     if(Greenfoot.isKeyDown("Backspace"))
     getWorld().removeObject(this);
    }    
}
