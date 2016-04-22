import greenfoot.*;

/**
 * Write a description of class Comedy here.
 * 
 * @author (Gewelle Ross) 
 * @version (4/14/2016)
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
