import greenfoot.*;

/**
 * Gameshow starts the game.
 * 
 * @author Paul Frazier, Terrence Dawson, Gewelle Ross 
 * @version 1.3
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

        prepare();
    }//End Method

    public void act()
    {//game music method
        myMusic.play();

        if(Greenfoot.isKeyDown("1"))
            addObject(new Food1(), 480,320);

        if(Greenfoot.isKeyDown("2"))
            addObject(new Food2(), 480,320);

        if(Greenfoot.isKeyDown("3"))
            addObject(new Food3(), 480,320);

        if(Greenfoot.isKeyDown("A"))
            addObject(new Food4(), 480,320);

        if(Greenfoot.isKeyDown("B"))
            addObject(new Food5(), 480,320);

        if(Greenfoot.isKeyDown("C"))
            addObject(new Beach(), 480,320);

        if(Greenfoot.isKeyDown("D"))
            addObject(new Home(), 480,320);

        if(Greenfoot.isKeyDown("E"))
            addObject(new Amusement(), 480,320);

        if(Greenfoot.isKeyDown("F"))
            addObject(new Park(), 480,320);

        if(Greenfoot.isKeyDown("G"))
            addObject(new Zoo(), 480,320);

        if(Greenfoot.isKeyDown("H"))
            addObject(new Comedy(), 480,320);

        if(Greenfoot.isKeyDown("I"))
            addObject(new Adventure(), 480,320);

        if(Greenfoot.isKeyDown("J"))
            addObject(new Horror(), 480,320);

        if(Greenfoot.isKeyDown("K"))
            addObject(new Romance(), 480,320);

        if(Greenfoot.isKeyDown("L"))
            addObject(new Drama(), 480,320);

        if(Greenfoot.isKeyDown("M"))
            addObject(new Musical(), 480,320);

        if(Greenfoot.isKeyDown("N"))
            addObject(new Carnival(), 480,320);

        if(Greenfoot.isKeyDown("O"))
            addObject(new Hiking(), 480,320);

        if(Greenfoot.isKeyDown("P"))
            addObject(new Play(), 480,320);

        if(Greenfoot.isKeyDown("Q"))
            addObject(new Bar(), 480,320);

        if(Greenfoot.isKeyDown("R"))
            addObject(new Board(), 480,320);

        if(Greenfoot.isKeyDown("S"))
            addObject(new Golf(), 480,320);

        if(Greenfoot.isKeyDown("T"))
            addObject(new Card(), 480,320);

        if(Greenfoot.isKeyDown("U"))
            addObject(new Arcade(), 480,320);

        if(Greenfoot.isKeyDown("V"))
            addObject(new Video(), 480,320);

        if(Greenfoot.isKeyDown("W"))
            addObject(new Adventure2(), 480,320);

        if(Greenfoot.isKeyDown("X"))
            addObject(new Seafood(), 480,320);

        if(Greenfoot.isKeyDown("Y"))
            addObject(new Puzzle(), 480,320);

        if(Greenfoot.isKeyDown("Z"))
            addObject(new Chinese(), 480,320);

        if(Greenfoot.isKeyDown("0"))
            addObject(new Concert(), 480,320);
           
        if(Greenfoot.isKeyDown("Space"))
        Greenfoot.setWorld(new TheEnd());
       }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Instructions instructions = new Instructions();
        addObject(instructions, 866, 226);
        Bad bad = new Bad();
        addObject(bad, 132, 461);
        Good good = new Good();
        addObject(good, 143, 322);
        good.setLocation(347, 502);
        good.setLocation(134, 328);
        good.setLocation(128, 295);
        bad.setLocation(127, 431);
        good.setLocation(129, 294);
        instructions.setLocation(867, 215);
    }
}



