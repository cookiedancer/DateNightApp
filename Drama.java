import greenfoot.*;

/**
 * Write a description of class Drama here.
 * 
 * @author (Gewelle Ross) 
 * @version (4/14/2016)
 */
public class Drama extends Movie
{
    GreenfootSound myMusic = new GreenfootSound("DUN DUN DUUUUN!!!.wav");
    /**
     * Act - do whatever the Drama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
    }    
}
