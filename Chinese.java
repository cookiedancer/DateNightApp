import greenfoot.*;

/**
 * Write a description of class Chineese here.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross 
 * @version 1.3
 */
public class Chinese extends Random
{
     GreenfootSound myMusic = new GreenfootSound("Traditional Chinese Instrument.wav");
    /**
     * Act - do whatever the Chineese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       myMusic.play();
       
       if(Greenfoot.isKeyDown("Backspace"))
       getWorld().removeObject(this);
    }    
}
