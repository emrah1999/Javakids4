package lesson28Exception2;


public class Character {
    private   Double health;
    public Character(Double health){
        this.setHealth(health);
    }
    public void setHealth(Double health) {
        if(health<10){
            System.out.println("Saglamliq menfi ola bilmez");
            return;
        }
        this.health = health;
    }
    public Double getHealth(){
        return this.health;
    }
}
