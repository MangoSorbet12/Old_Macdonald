package Old_Macdonald;

public class Chick extends Animal
{
    private String species="";
    private String sound1="";
    private String sound2="";
    
    public Chick(String species, String sound1,String sound2)
    { 
        this.species= species;
        this.sound1= sound1;
        this.sound2= sound2;
    }
    public String getSound()
    {
        int randomNum= (int)(Math.random()*2)+0;
        String result= "";
//System.out.println(randomNum);
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

    public String getType()
    {
        return species;
    }
}
