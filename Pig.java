//accidentally made an Old_Macdonald file inside an Old_Macdonald file with the 7 classes already made
package Old_Macdonald;
public class Pig extends Animal
{
    private String species;
    private String sound;
    
    //overrides the Pig constructor
    public Pig(String species, String sound)
    {
        this.species= species;
        this.sound= sound;
    }

    //overrides the Animal methods
    public String getSound()
    {
        return sound;
    }

    public String getType()
    {
        return species;
    }
}