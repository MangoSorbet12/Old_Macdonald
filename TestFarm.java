//this is here because I accidently cloned my Old_Macdonald repository in a already made Old_Macdonald file
//with the 7 classes (I did the steps in reverse)
package Old_Macdonald;
public class TestFarm
{
    public static void main (String[] args)
    {
    //basically tests whether the constructors for Cow, Pig, and Chick class are working,
    //along with whether their methods work too
    /* 
        
        Cow cow= new Cow("cow", "moo");
        System.out.println("The type "+cow.getType()+" goes "+cow.getSound());

        Pig pig= new Pig ("pig", "oink");
        System.out.println("The type "+pig.getType()+" goes "+pig.getSound());

        Chick chick= new Chick("chick","cluck","cheep");
        System.out.println("The type "+chick.getType()+" goes "+chick.getSound());
        
       
    */

    //creates a Farm object and uses the method from Farm class     
    Farm farm= new Farm();
    farm.animalSounds();

    
    }
}