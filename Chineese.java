import greenfoot.*;

/**
 * Write a description of class Chineese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chineese extends Random
{
     GreenfootSound myMusic = new GreenfootSound("Traditional Chinese Instrument.wav");
    /**
     * Act - do whatever the Chineese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
    }    
}