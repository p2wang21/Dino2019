
/**
 * Write a description of class DinoDriver1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver1
{
    public static void main(String[] args)
    {
        //Dinosaur d = new Dinosaur("Dinosaur");
        Dinosaur d1 = new TRex();
        Dinosaur d2 = new Pterodactyl();
        Dinosaur d3 = new Velociraptor();
        d1.setHealth(100);
        d2.setHealth(100);
        d3.setHealth(100);
        int winCount = 0;
        
        for(int i=0; i<10; i++)
        {
                if(d1.attack(d2))
                    winCount++;
             
                System.out.println(d1.toString()+"  ***   "+d2.toString());

            
        }
        System.out.println("The instigator emerged victorious in "+ winCount +" out of 10 attacks");
    }
}
