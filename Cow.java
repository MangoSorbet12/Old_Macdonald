package Old_Macdonald;
public class Cow extends Animal
{
    private String species;
    private String sound;
    public Cow(String species, String sound)
    {
        this.species= species;
        this.sound=sound;
    }
 
    public Cow()
    {
        
    }

    public String getSound()
    {
        return sound;
    }
    
    public String getType()
    {
        return species;
    }
}