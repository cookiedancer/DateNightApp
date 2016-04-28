import greenfoot.*;

/**
 * Write a description of class Adventure here.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross 
 * @version 1.3
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
