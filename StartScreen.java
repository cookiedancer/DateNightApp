import greenfoot.*;

/**
 * Starts the Application
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross
 * @version 1.3
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        super(1000, 600, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new Gameshow());
    }
}
