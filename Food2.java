import greenfoot.*;

/**
 * Write a description of class Food2 here.
 * 
 * @author (Gewelle Ross) 
 * @version (4/14/2016)
 */
public class Food2 extends Food
{
    GreenfootSound myMusic = new GreenfootSound("Traditional Chinese Instrument.wav");
    /**
     * Act - do whatever the Food2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
    }    
}
