import greenfoot.*;

/**
 * Write a description of class Drama here.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross 
 * @version 1.3
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
        
        if(Greenfoot.isKeyDown("Backspace"))
        getWorld().removeObject(this);
    }    
}
