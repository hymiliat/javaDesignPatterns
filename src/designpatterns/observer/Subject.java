package designpatterns.observer;

import designpatterns.observer.Observer;

public interface Subject {
    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObservers();
}