import greenfoot.*;

/**
 * Write a description of class Comedy here.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross
 * @version 1.3
 */
public class Comedy extends Movie
{
    GreenfootSound Comedy = new GreenfootSound("Laughing Sound.wav");
    public int counter = 20;
    /**
     * Act - do whatever the Comedy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Comedy.play();
        counter = counter + 20;
        if(counter < 0)
        getWorld().removeObject(this);
    }    
}
