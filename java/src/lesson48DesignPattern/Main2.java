package lesson48DesignPattern;

public class Main2 {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Observer observer=new Observer("Instagram");

        newsAgency.setObserver(observer);

        newsAgency.setNews("Nihat yeni post paylashdi");

    }
}
