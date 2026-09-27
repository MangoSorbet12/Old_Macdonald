package Old_Macdonald;
public class Pig extends Animal
{
    private String species;
    private String sound;
    
    public Pig(String species, String sound)
    {
        this.species= species;
        this.sound= sound;
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