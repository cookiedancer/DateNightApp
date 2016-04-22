import greenfoot.*;

/**
 * Write a description of class Horror here.
 * 
 * @author (Gewelle Ross) 
 * @version (4/14/2016)
 */
public class Horror extends Movie
{
    GreenfootSound myMusic = new GreenfootSound("evillaugh5.wav");
    /**
     * Act - do whatever the Horror wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
    }    
}
