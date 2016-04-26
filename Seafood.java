import greenfoot.*;

/**
 * Write a description of class Seafood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seafood extends Random
{
     GreenfootSound myMusic = new GreenfootSound("Reggae celebrating.wav");
    /**
     * Act - do whatever the Chineese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
    }    
}
