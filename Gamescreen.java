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
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
 
        if(Greenfoot.isKeyDown("2"))
        setImage("Italian background.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("3"))
        setImage("American background.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("4"))
        setImage("Indian background.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("5"))
        setImage("Oriental background.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("A"))
        setImage("Amusement Park.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("B"))
        setImage("Beach.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("C"))
        setImage("Home.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("D"))
        setImage("Park.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("E"))
        setImage("Zoo.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("6"))
        setImage("Action.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("7"))
        setImage("Comedy.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("8"))
        setImage("Horror.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("9"))
        setImage("Musical.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
        
        if(Greenfoot.isKeyDown("0"))
        setImage("Romance.jpg"); 
        Greenfoot.delay(70);
        setImage("Gamescreen.jpg");
    }//End Method
        
}//End Class
