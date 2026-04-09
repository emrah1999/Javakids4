package lesson47DesignPattern;

public class Main {
    public static void main(String[] args) {
        GameSettings settings1= GameSettings.getInstance();
        GameSettings settings2= GameSettings.getInstance();
        GameSettings settings23= GameSettings.getInstance();
        GameSettings settings4= GameSettings.getInstance();
        GameSettings settings6= GameSettings.getInstance();
        GameSettings settings8= GameSettings.getInstance();
        if (settings1 == settings2) {
            System.out.println("Both settings1 and settings2 refer to the same instance.");
        } else {
            System.out.println("settings1 and settings2 refer to different instances.");
        }
    }
}
