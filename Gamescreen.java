import greenfoot.*;

/**
 * Gamescreen selects actions
 * 
 * @Paul Frazier, Terrence Dawson, Gewelle Ross
 * @V1.3
 */
public class Gamescreen extends Actor
{//Start Class
    
    /**
     * Act - do whatever the Gamescreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {//Start Method
        if(Greenfoot.isKeyDown("1"))
        setImage("Hispanic background.jpg"); 
        Greenfoot.delay(5);
        setImage("Gamescreen.jpg");
        
    }//End Method
    
    
    
    
}//End Class
