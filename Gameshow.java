import greenfoot.*;

/**
  * Gameshow starts the game.
  * 
  * @author Paul Frazier, Terrence Dawson, Gewelle Ross 
  * @version V1.3
  */
public class Gameshow extends StartScreen
{     
       GreenfootSound myMusic = new GreenfootSound("Showmusic.mp3");
    /**
     * Constructor for objects of class Gameshow.
     * 
     */
    
    public Gameshow()
    {//Start Method
        Gamescreen Board = new Gamescreen();
        addObject(Board, 480,320);
    }//End Method
    
    public void act()
    {//game music method
        myMusic.play();
    }

}
