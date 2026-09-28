package Old_Macdonald;
public class NamedCow extends Cow
{
    private String name;

 public NamedCow(String species, String sound, String name)
    {
        super(species, sound);
        this.name= name;
        species= "cow";
        sound= "moo";
    }


    public String getName()
    {
        name= "Elsie";
        return name;
    }
}