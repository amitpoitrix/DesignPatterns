package ObserverPattern.Observer;

public class NewsChannel implements IObserver{
    String channelName;
    String news;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String news) {
        this.news = news;
        display();
    }

    public void display() {
        System.out.println(channelName + " channel news: " + news);
    }
}
