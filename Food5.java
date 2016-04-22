import greenfoot.*;

/**
 * Write a description of class Food5 here.
 * 
 * @author (Gewelle Ross) 
 * @version (4/14/2016)
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
    }    
}
