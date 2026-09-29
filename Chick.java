//cloned repository too late (already made 7 classes + a file in advance)
package Old_Macdonald;
public class Chick extends Animal
{
    private String species="";
    private String sound1="";
    private String sound2="";
    
    //this constructor is overriding the parameters needed for creating a chick object
    public Chick(String species, String sound1,String sound2)
    { 
        this.species= species;
        this.sound1= sound1;
        this.sound2= sound2;
    }

    //this is overriding the animal method getSound by making it so that the chick can produce 2 different sounds:
    //one is cheep, and the other is cluck (50/50 chance)
    public String getSound()
    {
        int randomNum= (int)(Math.random()*2)+0;
        String result= "";
        if(randomNum==1)
        {
            result= sound1;
        }
        else
        {
            result= sound2;
        }

        return result;

    }

     //this is also overriding one of the animal methods by simply returning the species put in the chick object's
    //parameters in the Farm class
    public String getType()
    {
        return species;
    }
}
