
/**
 * Write a description of class Pterodactyl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pterodactyl extends Dinosaur
{
    public Pterodactyl()
    {
        super("Pterodactyl");
    }

    public boolean attack(Dinosaur def)
    {
        if (def.getType().equals("TRex"))
        {
            if(Math.random() < 0.70)
            {
                this.Update(def, true);
                return true;
            }
            else
            {
                this.Update(def, false);
                return false;
            }
        }
        else if (Math.random() < 0.50)
            {
                this.Update(def, true);
                return true;
            }
            else
            {
                this.Update(def, false);
                return false;
            }
    }
}