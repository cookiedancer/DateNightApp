import greenfoot.*;

/**
 * Write a description of class Romance here.
 * 
 * @author (Gewelle Ross) 
 * @version (4/14/2016)
 */
public class Romance extends Movie
{
    GreenfootSound myMusic = new GreenfootSound("Romantic Saxophone.wav");
    /**
     * Act - do whatever the Romance wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
    }    
}
