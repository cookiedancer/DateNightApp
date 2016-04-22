import greenfoot.*;

/**
 * Write a description of class Shelter here.
 * 
 * @author Paul Frazier 
 * @version V1.0
 */
public class Shelter extends World
{//Start Class
    private Pet[] pets;
    private static final int NUMBER_OF_PETS = 5;
    private String[] petNames;
    private String[] petImageFileNames;
    private String[] petSoundFileNames;
    
    public Shelter()
    {//Start method    
        super(600, 400, 1); 
        this.pets = new Pet[NUMBER_OF_PETS];
        this.petNames = new String[] {"Skip", "Celine",
                        "Wisey", "Slinky", "Rolley"};
        this.petImageFileNames = new String[] {"frog", "sheep",
                        "elephant", "snake", "pig"};
        this.petSoundFileNames = new String[] {"croak", "baa",
                        "elephant", "snakehiss", "oink"};
                        
        for (int i = 0; i < this.pets.length; i++){
            Pet shelterPet = new Pet(this.petNames[i],
                                       0,
                                       this.petImageFileNames[i] + ".png",
                                       this.petSoundFileNames[i] + ".wav");
            this.pets[i] = shelterPet;
        }
        this.placePets(); // place the pets on the stage
    }//End method
    
    public void placePets()
    {//Start method
            for (int i = 0; i < this.pets.length; i++) {
                addObject(pets[i],
                    Greenfoot.getRandomNumber(500),
                    Greenfoot.getRandomNumber(300));
                pets[i].playPetSound();
                Greenfoot.delay(5);
            }
    }//End method
}//End class



