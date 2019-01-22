
/**
 * Write a description of class Velociraptor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Velociraptor extends Dinosaur
{
    public Velociraptor()
    {
        super("Velociraptor");
    }

    public boolean attack(Dinosaur def)
    {
            if (def.getType().equals("Velociraptor"))
            {
                if(Math.random() < 0.75)
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
