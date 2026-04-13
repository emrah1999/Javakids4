package lesson48DesignPattern;

public class NewsAgency {
    private String news;

    private Observer observer;

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public void setNews(String news) {
        this.news = news;
        notifyObserver();
    }

    private void notifyObserver() {
        if (observer != null) {
            observer.update(news);
        }
    }
}
