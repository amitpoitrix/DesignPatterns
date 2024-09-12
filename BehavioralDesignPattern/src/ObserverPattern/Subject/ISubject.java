package ObserverPattern.Subject;

import ObserverPattern.Observer.IObserver;

public interface ISubject {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers();
}
