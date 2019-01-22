import java.util.Scanner;
import java.util.ArrayList;
public class DinoDriver3
{
    public static void main(String[] args)
    {
        ArrayList<Dinosaur> myPop = new ArrayList<Dinosaur>();
        Scanner scan = new Scanner(System.in);
        int text = scan.nextInt();

        for (int i = 0; i < text; i++)
        {
            double num = Math.random();
            if (num < 0.33)
            {
                myPop.add(new TRex());
            }
            else if (num > 0.33 && num < 0.67)
            {
                myPop.add(new Velociraptor());
            }
            else
            {
                myPop.add(new Pterodactyl());
            }
        }
        for(Dinosaur d:myPop)
        {
            int age = (int)(Math.random()*30);
            for (int i = 0; i < age; i++)
            {
                d.ageUp();
            }
            System.out.println(d);
        }
        int winCount = 0, battleCount = 0, roundCount = 0;
        while (livingDinos(myPop) > 1)
        {
            for(Dinosaur d : myPop)
            {
                d.ageUp();
            }
            for(Dinosaur d : myPop) //for each loop
            {
                if(d.getIsAlive() == true && livingDinos(myPop) > 1)
                {
                    battleCount++;
                    Dinosaur defend = myPop.get(DinoDriver3.getDefender(myPop, d));
                    if(d.attack(defend))
                    // {
                        winCount++;
                    // }
                }
            }
            roundCount++;
            DinoDriver3.removeDeadDinos(myPop);
            System.out.println("ROUND: " + roundCount + " // Total battles: " + battleCount + " // Total wins: " + winCount + " // Total alive: " + livingDinos(myPop));
        }
        Dinosaur winner = null;
        for (Dinosaur d : myPop)
        {
            if (d.getIsAlive() == true)
            {
                winner = d;
            }
        }
    }

    public static int livingDinos(ArrayList<Dinosaur> p)
    {
        int living = 0;
        for (Dinosaur d : p)
        {
            if(d.getIsAlive() == true)
            {
                living++;
            }
        }
        return living;
    }

    public static int getDefender(ArrayList<Dinosaur> p, Dinosaur attacker)
    {
        Dinosaur def;
        int rand = -1;
        do
        {
            rand = (int)(Math.random()*p.size());
            def = p.get(rand);
        } while (def == attacker || def.getIsAlive() == false);
        return rand;
    }

    public static void removeDeadDinos( ArrayList<Dinosaur> p )
    {
        for(int i =0; i<p.size(); i++)
            if(p.get(i).getIsAlive() == false)
            {
                p.remove(i);
            }
    }

    public static ArrayList danceCard(ArrayList<Dinosaur> p)
    {
        ArrayList<Dinosaur> suitors = new ArrayList<Dinosaur>();
        int random = (int)(p.size()*0.1);
        for (int i = 0; i < random; i++)
        {
            int rand = (int)(Math.random() * p.size());
            suitors.add(p.get(rand));
        }
        return suitors;
    }
}
