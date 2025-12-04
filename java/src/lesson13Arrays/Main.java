package lesson13Arrays;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu=new Pokemon("Pikachu",50,200);
        Pokemon charmander=new Pokemon("Charmander",40,250);

        while(pikachu.isAlive() && charmander.isAlive()){
            pikachu.attack(charmander);
            if(charmander.isAlive()){
                charmander.attack(pikachu);
            }
            pikachu.train();
            charmander.train();
        }
        if(pikachu.isAlive()){
            System.out.println("Pikachu wins!");
        } else {
            System.out.println("Charmander wins!");
        }
    }
}
