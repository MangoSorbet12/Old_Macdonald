//cloned a repository accidentally after making a full Old_Macdonald file
package Old_Macdonald;
public class Farm
{
    private Animal[] a = new Animal[3];
        Farm() 
        {
            //edited this so that the cow also gets a name (casting)
            //found this on https://www.geeksforgeeks.org/java/class-type-casting-in-java/
            a[0] = new NamedCow("cow","moo","Elsie");
            a[1] = new Chick("chick","cluck","cheep");
            a[2] = new Pig("pig","oink");
        }
        
        public void animalSounds() 
        {
            for (int i = 0; i < a.length; i++) 
            {
                System.out.println(a[i].getType() + " goes " + a[i].getSound());
            }
            System.out.println("The cow is known as " +((NamedCow)a[0]).getName());
        }

        
}