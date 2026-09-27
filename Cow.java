public class Cow extends Animal
{
    private String species;
    private String sound;
    public Cow(species, sound)
    {
        this.species= species;
        this.sound=sound;
    }
    public String makeSound()
    {
        return sound;
    }
    
    public String getType()
    {
        return species;
    }
}