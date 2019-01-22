
/**
 * Write a description of class TRex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TRex extends Dinosaur
{
    public TRex()
    {
        super("TRex");
    }

    public boolean attack(Dinosaur def)
    {
        if (def.getType().equals("TRex"))
        {
            if(Math.random() < 0.55)
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
        else if (Math.random() < 0.80)
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
