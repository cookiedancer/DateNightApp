import greenfoot.*;

/**
 * Write a description of class Musical here.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross 
 * @version 1.3
 */
public class Musical extends Activities
{
    /**
     * Act - do whatever the Musical wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("Backspace"))
        getWorld().removeObject(this);
    }    
}
