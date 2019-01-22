
/**
 * Abstract class Dinosaur - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private String gender;
    private int wins;
    private int battleCount;
    private int health;
    private boolean isAlive;
    /**
     * Dinosaur Constructor - There is no default constructor because it is abstract and
     * each dinosaur will be unique so everything will be set later.
     */
    public Dinosaur(String t)
    {
        this.type = t;
        this.age = 0;
        this.wins = 0;
        this.health = 25;
        this.battleCount = 0;
        this.isAlive = true;
        if (Math.random()<0.5)
        {
            this.gender = "M";
        }
        else
        {
            this.gender = "F";   
        }

    }

    /**
     * 
     *  ================================SETTERS======================================================
     */
    public void setType(String t)
    {
        this.type = t;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    public void setWins(int w)
    {
        this.wins = w;
    }

    public void setHealth(int h)
    {
        this.health = h;
    }

    public void setIsAlive(boolean a)
    {
        this.isAlive = a;
    }

    public void setBattleCount(int b)
    {
        this.battleCount = b;
    }

    public void setGender(String newGen)
    {
        this.gender = newGen;
    }

    /**
     * 
     *================================= GETTERS =============================================
     */
    public String getType()
    {
        return this.type;
    }

    public int getAge()
    {
        return this.age;
    }

    public int getWins()
    {
        return this.wins;
    }

    public int getHealth()
    {
        return this.health;
    }

    public int getBattleCount()
    {
        return this.battleCount;
    }

    public String getGender()
    {
        return this.gender;
    }

    public boolean getIsAlive()
    {
        return this.isAlive;
    }

    /**
     * ATTACK METHOD IS ABSTRACT BECAUSE WE DO NOT YET KNOW HOW EACH DINOSAUR WILL ATTACK. IF
     * IT IS SET TO FALSE THE OUTCOME WOULD BE DECIDED EVERYTIME.
     */
    public abstract boolean attack(Dinosaur def);

    
    public void addWins(int amt)
    {
        this.wins = this.wins + amt;
    }

    public void ageUp()
    {
        this.age++;
        if (age>25)
        {
            this.health = this.health - 3;
        }
        else
        {
            this.health = this.health + 5;
        }
        if (this.health> 100)
        {
            this.health = 100;
        }
        this.checkHealth();
    }

    public void checkHealth()
    {
        if (this.health <= 0)
        {
            if(this.getIsAlive() == true)
            {//health is 0, but isAlive is true = just died
                System.out.println("\t"+this.toString() + " just died");
            }
            this.isAlive = false;
            this.health = 0;
        }
        else if (this.health > 100)
        {
            this.health = 100;
        }
    }

    public void Update(Dinosaur def, boolean winner)
    {
        this.battleCount++;
        def.setBattleCount(def.getBattleCount() + 1);
        if (winner == true)
        {
            this.wins++;
            def.setHealth(def.getHealth() -20);
            def.checkHealth();
        }
        else
        {
            def.setWins(def.getWins()+1);
            this.health -=20;
            this.checkHealth();
        }

    }

    public String toString()
    {
        String temp =" ";
        temp = "Type: " + this.type + ", Age: " + this.age + ", Gender: " + this.gender + ", Wins: " + this.wins + ", Health: " + this.health;
        return temp;
    }
}
