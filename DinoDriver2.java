
/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{
    public static void main(String args[])
    {
        Dinosaur[] pop = new Dinosaur[100];

        for (int i = 0; i<33; i++)
        {
            pop[i] = new TRex();
        }
        for (int i = 33; i<66; i++)
        {
            pop[i] = new Velociraptor();
        }
        for (int i = 66; i<pop.length; i++)
        {
            pop[i] = new Pterodactyl();
        }

        int deadCount = 0;
        for (int i = 0; i<pop.length; i++)
        {
            Dinosaur d = pop[i];
            if(d.getIsAlive() == false)
                deadCount++;
        }

        for(Dinosaur d : pop) //for each loop
        {
            int rand = (int)(Math.random()*30);
            for(int i = 0; i<rand; i++)
            {
                d.ageUp();
            }
            //System.out.println(d);
        }

        int winCount = 0, battleCount = 0, roundCount = 0;
        while (livingDinos(pop) > 1)
        {
            for(Dinosaur d : pop) //for each loop
            {
                if(d.getIsAlive() == true && livingDinos(pop) > 1)
                {
                    battleCount++;
                    Dinosaur defend = DinoDriver2.getDefender(pop, d);
                    if(d.attack(defend))
                    // {
                        winCount++;
                    // }
                }
            }
            roundCount++;
            System.out.println("ROUND: " + roundCount + " // Total battles: " + battleCount + " // Total wins: " + winCount + " // Total alive: " + livingDinos(pop));
        }
        Dinosaur winner = null;
        for (Dinosaur d : pop)
        {
            if (d.getIsAlive() == true)
            {
                winner = d;
            }
        }
        System.out.println("THE WINNER IS: " + winner);
    }

    public static int livingDinos(Dinosaur[] p)
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

    public static Dinosaur getDefender(Dinosaur[] p, Dinosaur attacker)
    {
        Dinosaur def;
        do
        {
            int rand = (int)(Math.random()*p.length);
            def = p[rand];
        } while (def == attacker || def.getIsAlive() == false);
        return def;
    }
}

// int[] nums = new int[10];

// System.out.println(nums[0]);

// for(int i = 0; i<nums.length; i++)
// {
// nums[i] = 10+i;
// }
// for (int i = 0; i<nums.length; i++)
// {
// System.out.println(nums[i]);
// }
// for (int answer : nums)
// {
// System.out.println(answer);
// }