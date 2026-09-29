//cloning repository issue
package Old_Macdonald;

public class Cow extends Animal
{
    private String species;
    private String sound;

    //this is the first constructor of the Cow class (basically returns the species and sound)
    public Cow(String species, String sound)
    {
        this.species= species;
        this.sound=sound;
    }
  
    //similar to other subclasses of Animal- these methods just override the Animal methods by replacing 
    // what they return with the parameter in the Cow's constructor
    public String getSound()
    {
        return sound;
    }
    
    public String getType()
    {
        return species;
    }
}