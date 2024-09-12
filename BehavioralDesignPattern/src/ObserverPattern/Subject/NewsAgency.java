package ObserverPattern.Subject;

import ObserverPattern.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements ISubject{
    private final List<IObserver> observerList = new ArrayList<>();
    String latestNews = "";

    public void setNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }

    @Override
    public void attach(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver ob: observerList) {
            ob.update(latestNews);
        }
    }
}
