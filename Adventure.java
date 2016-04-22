import greenfoot.*;

/**
 * Write a description of class Adventure here.
 * 
 * @author (Gewelle Ross) 
 * @version (4/14/2016)
 */
public class Adventure extends Movie
{
    GreenfootSound myMusic = new GreenfootSound("Adventure Sound.wav");
    /**
     * Act - do whatever the Adventure wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
    }    
}
