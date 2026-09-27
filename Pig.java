public class Pig extends Animal
{
    private String species;
    private String sound;
    
    public Pig(species, sound)
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