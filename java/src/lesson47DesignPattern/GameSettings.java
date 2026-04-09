package lesson47DesignPattern;

public class GameSettings {
    private static GameSettings instance;


    private GameSettings() {
        System.out.println("Score yazaq");
        int yumruq=30;
    }

    public static GameSettings getInstance(){
        if(instance == null){
            instance = new GameSettings();
        }
        return instance;
    }
}
