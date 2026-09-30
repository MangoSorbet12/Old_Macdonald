//cloning repository mistake (accidentally did it later than intended)
package Old_Macdonald;
public class NamedCow extends Cow
{
    private String name;

 public NamedCow(String species, String sound, String name)
    {
        //using the species and sound variables from the Cow class
        super(species, sound);
        this.name= name;

    }


    public String getName()
    {
        return name;
    }
}