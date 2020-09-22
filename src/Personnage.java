public class Personnage {

   private String pseudo ="";
   private int health = 100;
   private int attack = 10;

    public String getPseudo()
    {
        return this.pseudo;
    }
    public void setPseudo(String pseudo)
    {
        this.pseudo = pseudo;
    }
    public int getAttack()
    {
        return attack;
    }
    public void setAttack(int attack)
    {
        this.attack = attack;
    }
    public int getHealth()
    {
        return health;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }

}
