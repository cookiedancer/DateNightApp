import greenfoot.*;

/**
 * Write a description of class Pet here.
 * 
 * @author Paul Frazier 
 * @version V1.0
 */
public class Pet extends MightyPet
{//Start class
    private String name;
    private int age;
    private String image;
    private String sound;
    private boolean isFriendly;
    /**
     * Constructor for objects of class Pet
     * 
     */
    public Pet()
    {//Start method
        this.name = new String();
        this.age = 0;
        this.sound = new String("boing.wav");
        this.isFriendly = false;
        this.playPetSound();
    }//End method
    
    public Pet(String petName, int petAge, String imageFileName, String soundFileName)
    {//Start method
        this.name = petName;
        this.age = petAge;
        this.image = imageFileName;
        this.sound = soundFileName;
        this.isFriendly = false;
        
        setImage(this.image);
    }//End method
    
    public void playPetSound()
    {//Start method
        Greenfoot.playSound(this.sound);
    }//end method
}//End class
