public class TestFarm
{
    public static void main (String[] args)
    {
        Cow cow= new Cow("cow", "moo");
        System.out.println("The type "+cow.getType()+" goes "+cow.getSound());

        Pig pig= new Pig ("pig", "oink")
        System.out.println("The type "+pig.getType()+" goes "+cow.getSound());

        Chick chick= new Chick("chick","cluck","cheep")
        System.out.println("The type "+chick.getType()+" goes "+chick.getSound());
        
 
    }
}