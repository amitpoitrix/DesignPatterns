package ObserverPattern;

import ObserverPattern.Observer.NewsChannel;
import ObserverPattern.Subject.NewsAgency;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // creating subject
        NewsAgency newsAgency = new NewsAgency();

        // creating observers who's going to subscribe to subject
        NewsChannel aajTak = new NewsChannel("aajTak");
        NewsChannel zeeNews = new NewsChannel("zeeNews");

        // news channel are subscribing to news agency
        newsAgency.attach(aajTak);
        newsAgency.attach(zeeNews);

        // Now news agency is publishing news and it'll be notified to its subscribers
        newsAgency.setNews("Again a new design pattern is innovated");
        newsAgency.setNews("No need of patterns now");
    }
}
