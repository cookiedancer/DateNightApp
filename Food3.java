import greenfoot.*;

/**
 * Write a description of class Food3 here.
 * 
 * @author (Gewelle Ross) 
 * @version (4/14/2016)
 */
public class Food3 extends Food
{
    GreenfootSound myMusic = new GreenfootSound("Short Clip Italian Week.wav");
    /**
     * Act - do whatever the Food3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
    }    
}
