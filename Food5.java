import greenfoot.*;

/**
 * Write a description of class Food5 here.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross 
 * @version 1.3
 */
public class Food5 extends Food
{
    GreenfootSound myMusic = new GreenfootSound("Reggae celebrating.wav");
    /**
     * Act - do whatever the Food5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        myMusic.play();
        
    if(Greenfoot.isKeyDown("Backspace"))
    getWorld().removeObject(this);
    }    
}
