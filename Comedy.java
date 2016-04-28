import greenfoot.*;

/**
 * Write a description of class Comedy here.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross
 * @version 1.3
 */
public class Comedy extends Movie
{
    GreenfootSound myMusic = new GreenfootSound("Laughing Sound.wav");
    /**
     * Act - do whatever the Comedy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
    }    
}
