package lesson13Arrays;

public class Pokemon {
    String name;
    int power;
    int health;

    public Pokemon(String name,int power,int health){
        this.name = name;
        this.power = power;
        this.health = health;
    }
    public void attack(Pokemon pokemon){
        pokemon.health-=this.power;
    }
    public void train(){
        this.power+=10;
    }
    public boolean isAlive(){
        return this.health>0;
    }
}
